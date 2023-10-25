@smoke
Feature: N11 Web sitesine gitme
  @anasayfayagit
  Scenario: N11 web sitesine gitmek istiyorum
    Given Kullanıcı ana sayfaya gider
    When Ana sayfanın yüklendiği doğrulanır
    And Kullanıcı ana sayfada Giriş Yap butonunu bulur ve tıklar
    And Giriş sayfasının yüklendiği doğrulanır
    And Kullanıcı giriş sayfasında geçerli bir kullanıcı adı girer
    And Kullanıcı giriş sayfasında geçerli bir şifre girer
    And Kullanıcı Giriş Yap butonuna tıklar
    And Kullanıcının hesabına başarılı giriş yapıldığı doğrulanır
@urunEkleme
  Scenario: N11 ürün ekleme
    Given Kullanıcı ana sayfaya gider
    When Ana sayfanın yüklendiği doğrulanır
    And Kullanıcı ana sayfada Giriş Yap butonunu bulur ve tıklar

