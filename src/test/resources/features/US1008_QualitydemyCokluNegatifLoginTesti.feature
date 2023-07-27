Feature: US1008 Toplu kullanici listesi ile negatif login testi

  @qd
  Scenario Outline: TC14 Kullanici listedeki kullanici bilgileri ile giris yapilamadigini test eder

    Given Kullanici "qdUrl" anasayfaya gider
    Then Ilk login linkine clik yapar
    And User email olarak "<email>" girer
    And Password olarak "<password>" girer
    When login butonuna basar
    Then giris yapilmadigini test eder
    Then Sayfayi kapatir
    Examples:
      | email         | password |
      | abc@gmail.com | 12345    |
      | asd@gmail.com  | 678974  |
      | klm@gmail.com  | 3214566 |
      | zzz@gmail.com  | java12  |

