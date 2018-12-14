# Java: Beginner

## Configuratie

Met deze Sushi kaarten ga je een simpel spel maken met éé van de meest populaire programmeertalen van de wereld: Java. Oorsprongelijk waren zowel Minecraft en Gmail in Java geschreven. Java is de programmeertaal die veel programmeurs als eerst hebben geleerd.

Het spel dat je gaat maken is iets dat je al kent: je gooit een "munt" op en moet raden op welke kant de munt landt.

Vaak moet je van alles en nog wat downloaden om met Java te kunnen programmeren, maar we gebruiken nu een online tool voor deze kaarten. Ga naar [https://repl.it/signup](https://repl.it/signup).

Deze tool heet **repl.it**. Je moet wel een account maken.
> Let op: de website is in het Engels, dus roep de hulp van een mentor in als je het lastig vindt.

Klik op `my repls` en maak een nieuw project aan voor `Java`

In het scherm zie je links het gedeelte waar je de code schrijft en rechts waar je het uitgevoerd (geprint) ziet worden.

## Hallo wereld!

Elke Java programmeur moet met een speciale code beginnen. Laten we ze maar even "toverspreuk" noemen. Later leggen we ze aan je uit. Type dit:

```java
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```

Klik op de `Run` knop om je code uit te voeren en kijk wat er rechts op je scherm gebeurt!

Dit is je eerste Java programma! Veel van die code is de toverspreuk, maar het stukje binnen de accolades (`{}`) is wat het laat werken. Dit heet de `main method` (= hoofdmethode). De code daarbinnen vertelt aan Java om op het scherm te printen wat er binnen de dubbele aanhalingstekens ("") staat. Dit is hoe het spel met de speler zal gaan praten.

```java
System.out.println("Hello wordl!");
```

Een paar dingen over de coderegel: de manier waarop Repl.it de code in verschillende kleuren zet (de tekstboodschap en het java commando). Haal de tekst weg (zet het ook weer terug in de code), zie je hoe de kleuren verandere? En: de regel eindigt op puntkomma (`;`). Dan weet Java dat dit het eind van de regel is. Type je de puntkomma niet, dan raakt Java in de war.

Natuurlijk is "Hallo wereld!" de klassieke manier om je eerste computerprogramma te schrijven. In het spel heb je het niet nodig. Verander de tekst naar "Raadt kop (k) of munt (m)!" en voer de code weer uit. Nu kun je de speler laten raden!

```java
System.out.println("Raadt kop (k) of munt (m)!");
```

## Praten met de gebruiker

