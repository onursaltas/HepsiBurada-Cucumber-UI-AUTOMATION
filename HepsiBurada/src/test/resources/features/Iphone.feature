Feature: HepsiBurada


  Scenario Outline: Hepsiburada Urun Senaryoları

    Given HepsiBurada Anasayfasına gidilir.
    When Hepsiburada login sayfasına gidilir.
    And Eposta Adresi alanına email bilgisi girilir.
    And Password alanına password girilir.
    And Giriş yap butonuna tıklanır
    And Login olduğu isminden kontrol edilir.
    And Iphone urunleri aranır "<ProductName>".
    And Iphone urunlerinin basariyla geldigi gorulur.
    And Iphone 11 urunu tiklanir.
    Then Testin tamamlandigi gorulur.

    Examples:
      | ProductName |

      | ıphone      |





