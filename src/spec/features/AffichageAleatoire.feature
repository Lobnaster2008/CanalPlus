Feature: Affichage Aleatoire
  En tant qu utilisateur je veux cliquer sur le boutton aleatoire afin d afficher une histoire aleatoire 
  et verifier que les gadgets sont presentes

  @affichage_aleatoire
  Scenario: Affichage Aleatoire
    Given Je me connecte sur le site BouletCorp
    When Je clique sur le boutton aleatoire
    Then Je verifie que le contenu de la page a change
    And les widgets facebook , twitter et tumblr sont affichees

 