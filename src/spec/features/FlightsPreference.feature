Feature: affichage information sur un vol selectionne
  En Tant qu utilisateur je veux selectionner un vol precis
  Afin d afficher toutes les informations qui le concerne

  @round-trip
  Scenario: affichage information sur un vol selectionne
  Given Je me connecte sur le site web  Mercury
  When Je clique sur le lien Flights
  And Je coche l option  "roundtrip"
  And Je selectionne passengers "2"
  And Je selectionne l aeroport  de deprt "London"
  And Je selectionne le mois de depart "2"
  And Je selectionne le jour de depart "15"
  And Je selectionne l aeroport  Arrivee "Paris" 
  And Je selectionne mois de retour "10"
  And Je selectionne jour de retour "10"
  And Je selectionne class "Business"
  And Je seelctionne airline "Unified Airlines"
  And Je clique sur le boutton continuer
  Then je me dirige vers page  "https://demo.guru99.com/test/newtours/reservation2.php"
  

    