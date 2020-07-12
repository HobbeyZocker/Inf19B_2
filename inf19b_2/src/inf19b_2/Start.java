package inf19b_2;

import java.util.Objects;

//import java.util.Arrays;

import inf19b_2.UI.UI_start;
import inf19b_2.managers.*;
import inf19b_2.goods.*;

public class Start {

	public static void main(String[] args) {

		IO_manager io_manager = new IO_manager();
		Comission_manager com_manager = new Comission_manager(io_manager.getComissionsList());
		UI_start ui_start = new UI_start();

		UI_start.go(null);

//		io_manager.readCSV(null);

//		Stone stone = new Stone("Mamor", "leicht");
//		Stone stone2 = new Stone("Mamor", "leicht");
//		Paper paper = new Paper("wei�","a4");
//		Paper paper2 = new Paper("Wei�", "A4");
//		Wood wood = new Wood("kiefer","balken");
//		Goods_manager goods_manager = new Goods_manager();
////		
//		goods_manager.pushObj(stone);
//		goods_manager.pushObj(stone2);
//		goods_manager.pushObj(paper);
////		goods_manager.pushObj(paper2);
////		goods_manager.pushObj(paper);
////		goods_manager.pushObj(paper2);
//		goods_manager.pushObj(wood);
////		goods_manager.pushObj(paper2);
//		goods_manager.popObj(paper2);

//		
//		goods_manager.popObj();

//		if ( Objects.equals(stone.getType(), stone2.getType()) && Objects.equals(stone.getWeight(), stone2.getWeight())) System.out.println("Si amigo");
//		test for the "same" object via type and weight 

//		if (goods_manager.contains(stone)) System.out.println("jo"); 
//		

//		System.out.println(Arrays.toString(com_manager.getOrder(1)));

	}

}

/*
 * Instructions: Allgemeine Hinweise:
 * 
 * Zu Implementieren ist die Programmieraufgabe in Java (Lauff�hig in Java SE
 * 14) Zu den Aufgaben ist eine entsprechende grafische Benutzeroberfl�che zu
 * entwickeln Arbeiten Sie mit den Prinzipien der objektorientierten
 * Programmierung wie in der Vorlesung behandelt Abzugeben sind alle
 * Quelldateien (*.java) in einem Zip gepackt �ber Moodle Es muss eine Klasse
 * "Start.java" mit einer main-Methode geben - hier wird das Programm gestartet
 * Start ist der 05.06.2020 Abgabeschluss ist der 24.07.2020, 23:59 Uhr In die
 * Bewertung flie�en funktionale Anforderungen (wie unten beschrieben), aber
 * auch subjektive Faktoren wie die Strukturierung des Codes oder die Gestaltung
 * der GUI ein. Die Arbeit ist keine Gruppenarbeit. Jeder muss einen
 * individuellen Programmentwurf anfertigen
 * 
 * 
 * Allgemeines:
 * 
 * Entwickeln Sie ein Spiel, in der Sie in die Rolle eines Lageristen schl�pfen.
 * Sie haben ein Lager und bekommen Auftr�ge, Waren einzulagern oder
 * auszulagern. F�r erledigte Auftr�ge bekommen Sie Geld. Ziel des Spiels ist
 * es, so viel wie m�glich einzunehmen.
 * 
 * 
 * 
 * Das Lager: Spiel startet, das Lager wird angelegt. Sie besitzen ein
 * Hochregallager mit drei Lagerpl�tzen Breite und drei Lagerpl�tzen H�he. Auf
 * einem Lagerplatz finden drei Paletten hintereinander Platz. Sie haben also
 * insgesamt f�r 27 Paletten Platz. Ihr Lager ist aktuell leer.
 * 
 * Der Auftrag: �ber den Button "Neuer Auftrag" kann ein neuer Auftrag abgerufen
 * werden. Es kann sich um einen Einlagerungsauftrag oder einen
 * Auslagerungsauftrag handeln. Der Auftrag beinhaltet folgende Informationen:
 * Produkt (siehe 3.), Belohnung (Wert in �). Es gibt keine Menge, es handelt
 * sich immer um eine Einheit. F�r die Erzeugung der Auftr�ge wird eine
 * CSV-Datei bereitgestellt. Wenn das Ende der Datei erreicht ist, kann wieder
 * mit Auftrag 1 begonnen werden. Falls �nderungen / Erg�nzungen des CSV Datei
 * notwendig werden, dokumentieren Sie dies in einer separaten Datei und geben
 * Sie beide Dateien mit ab.
 * 
 * Die Produkte: Es gibt verschiedene Produkte mit jeweils verschiedenen
 * Eigenschaften.
 * 
 * Papier: Eigenschaften: Farbe (Wei�, Gr�n, Blau), Gr��e (A3, A4, A5)
 * 
 * Besonderheiten: Keine
 * 
 * Holz: Eigenschaften: Art (Kiefer, Buche, Eiche), Form (Bretter, Balken,
 * Scheit)
 * 
 * Besonderheiten: Holzbalken sind lang und werden daher auf drei Paletten
 * verteilt. Ein gesamter Lagerplatz wird notwendig
 * 
 * Stein: Eigenschaften: Art (Marmor, Granit, Sandstein), Gewicht (Leicht,
 * Mittel, Schwer)
 * 
 * Besonderheiten: Schwere Steine sind zu Schwer f�r das Regal und k�nnen nur
 * unten eingelagert werden.
 * 
 * Die Abwicklung: Einlagerungsauftrag: Zu einem Auftrag werden die m�glichen
 * Lagerpl�tze dargestellt, also freie Lagerpl�tze. Nach Wahl eines Lagerplatzes
 * wird die Palette eingelagert und die Belohnung gutgeschrieben.
 * 
 * Auslagerungsauftrag: Zu einem Auftrag werden die m�glichen Lagerpl�tze
 * dargestellt, also Lagerpl�tze, an dem genau dieses Produkt eingelagert ist.
 * Nach Wahl eines Lagerplatzes wird die Palette ausgelagert und die Belohnung
 * wird gutgeschrieben
 * 
 * Die Lagerverwaltung: Es ist m�glich, dass ein Produkt zwar im Lager vorhanden
 * ist, aber es wird durch ein anderes Produkt weiter vorne blockiert. Um
 * dennoch an dieses Produkt heranzukommen, muss umgelagert werden. Dazu wird
 * die gew�nschte Palette ausgew�hlt. M�gliche Ziel-Lagerpl�tze werden
 * dargestellt. Nach Wahl eines Ziel-Lagerplatzes wird die Umlagerung
 * durchgef�hrt. Umlagerungen kosten 100 �. Des weiteren kann ein Produkt auch
 * verschrottet werden, das kostet 500�.
 * 
 * Das Auftragsmanagement: Es k�nnen maximal drei Auftr�ge gleichzeitig
 * bearbeitet werden (weitere Klicks auf "Neuer Auftrag"). So k�nnen Sie einen
 * Auftrag auch zun�chst einmal zur�ckstellen. Ein Auftrag kann auch abgelehnt
 * werden, allerdings wird die Belohnung als Vertragsstrafe vom Kontostand
 * abgezogen.
 * 
 * Die Bilanz: Nat�rlich muss immer der Kontostand sichtbar sein. Zus�tzlich
 * gibt es einen Button "Bilanz", der folgende Informationen anzeigt: Ums�tze
 * (Summe), Kosten (Summe) und Einzelbuchungen, also eine Tabelle mit jeder
 * Ver�nderung des Kontostands. Jede Buchung ist mit einem Text
 * (Einlagerungsauftrag, Auslagerungsauftrag, Umlagerung usw.) und einem Betrag
 * versehen.
 */
