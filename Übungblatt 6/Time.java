public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if (0 <= hours && hours <= 23) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
        if (0 <= minutes && minutes <= 59) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
        if (0 <= seconds && seconds <= 59) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    public Time(int hours, int minutes) {
        this(hours, minutes, 0);
    }

    public Time(int hours) {
        this(hours, 0, 0);
    }

    // eine Kopier-MethodeTime clone(), die eine neue Uhrzeit mit denselben Werten
    // erzeugt
    public static Time clone(Time originalTime) {
        Time clonedTime = new Time(originalTime.hours, originalTime.minutes, originalTime.seconds);
        return clonedTime;
    }

    // eine Methode, die prüft, ob die Uhrzeit dieselbe ist wie eine andere
    public boolean isequal(Time secondTime) {
        return (this.hours == secondTime.hours && this.minutes == secondTime.minutes
                && this.seconds == secondTime.seconds);
    }

    // eine Methode, die die Uhrzeit um die andere gegebene Uhrzeit vor stellt
    public Time forwardTime(Time secondTime) {
        int newSeconds = this.seconds + secondTime.seconds;
        int newMinutes = this.minutes + secondTime.minutes;
        int newHours = this.hours + secondTime.hours;
        if (newSeconds > 59) {
            newMinutes += newSeconds / 60;
            newSeconds = newSeconds % 60;
        }
        if (newMinutes > 59) {
            newHours += newMinutes / 60;
            newMinutes = newMinutes % 60;
        }
        if (newHours > 23) {
            newHours = newHours % 24;
        }
        Time newTime = new Time(newHours, newMinutes, newSeconds);
        return newTime;
    }

    // eine Methode, die die Uhrzeit um eine Sekunde vor stellt
    public Time forwardOneSecond() {
        Time oneSecond = new Time(0, 0, 1);
        return this.forwardTime(oneSecond);
    }

    // Hilfsmethode
    private int totalSeconds() {
        return (hours * 3600 + minutes * 60 + seconds);
    }

    // eine Methode, die den Abstand zwischen zwei Uhrzeiten angibt
    public Time difference(Time secondTime) {
        int diffInSeconds = 0;

        if(secondTime.hours >= this.hours){
            diffInSeconds = Math.abs(secondTime.totalSeconds() -this.totalSeconds());
        }
        else if(this.hours > secondTime.hours){
            diffInSeconds = 24*3600 - Math.abs(secondTime.totalSeconds() -this.totalSeconds());
        }
        Time timeDifference = new Time(
                diffInSeconds / 3600,                 //hours
                (diffInSeconds % 3600) / 60,          //minutes
                (diffInSeconds %60));                 //seconds

        return timeDifference;
    }

    //main Methode von Perplexity zum Testen
    public static void main(String[] args) {
    System.out.println("=== TEST 1: Konstruktoren & Validierung ===");
    Time t1 = new Time(10, 30, 45);
    Time t2 = new Time(14, 20);       // Sekunden sollten 0 sein
    Time t3 = new Time(25, 70, 90);   // Sollte auf 0:0:0 (oder gefilterte Werte) gesetzt werden
    
    System.out.println("t1 (Voll): " + t1);
    System.out.println("t2 (2 Params): " + t2);
    System.out.println("t3 (Ungültig): " + t3);
    
    System.out.println("\n=== TEST 2: Clone & Equals ===");
    Time t1Clone = Time.clone(t1);
    System.out.println("Klon von t1: " + t1Clone);
    System.out.println("Ist t1 == t1Clone? " + t1.isequal(t1Clone)); // Erwartet: true
    System.out.println("Ist t1 == t2? " + t1.isequal(t2));           // Erwartet: false

    System.out.println("\n=== TEST 3: forwardTime (Zeit addieren) ===");
    // Addiere t2 (14:20:00) auf t1 (10:30:45) -> Erwartet: 00:50:45 (wegen Überlauf 24h) oder 24:50:45
    Time tForward = t1.forwardTime(t2); 
    System.out.println(t1 + " + " + t2 + " = " + tForward);

    System.out.println("\n=== TEST 4: forwardOneSecond (Sekunde weiter) ===");
    Time tEnd = new Time(23, 59, 59);
    System.out.println("Vorher: " + tEnd);
    System.out.println("Nach 1 Sekunde: " + tEnd.forwardOneSecond()); // Erwartet: 00:00:00

    System.out.println("\n=== TEST 5: difference (Differenz) ===");
    Time start = new Time(12, 0, 0);
    Time end = new Time(14, 30, 10);
    Time diff = start.difference(end);
    System.out.println("Differenz zwischen " + start + " und " + end + ": " + diff);
    // Erwartet: 02:30:10
}

// Hilfsmethode für schöne Ausgabe (kannst du in deiner Klasse lassen)
public String toString() {
    // Formatiert die Ausgabe als HH:MM:SS mit führenden Nullen
    return String.format("%02d:%02d:%02d", hours, minutes, seconds);
}

}
