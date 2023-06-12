Feature: US1002 Amazon Title Testi

  @smoke @regression
  Scenario: TC04 Kullanici amazon sayfasinin title'nin dogru oldugunu kontrol eder

    Given Kullanici amazon anasayfaya gider
    Then title'ìn Amazon icerdigini test eder
    And Sayfayi kapatir