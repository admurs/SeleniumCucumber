@all
Feature: ets tur sitesine login
  Background: ets sitesine giris
    Given ets tur sitesine gidilir
    And login butonu ustune gidilir

  Scenario: TC-01 ets tur login
    When giris butonuna basilir
    And eposta girilir
    And sifre girilir
    When giris yap butonuna basilir
    Then safaya gidilemedigi dogrulanir
@ets
  Scenario: TC-02 ets tur üyelik
    And uye ol butonuna basilir
    And ad girilir
    And soyad girilir
    And uyelik epostasi girilir
    And cep telefonu girilir
    And uyelik icin sifre girilir
    And sifre yeniden girilir
    And kullanım sartlari checkboxu isaretlenir
    And firsat checkboxu isaretlenir
    When kayit ol butonuna basilir
    Then safaya gidilemedigi dogrulanir