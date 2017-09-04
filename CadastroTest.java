package br.selenium.test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import br.selenium.page.CadastroPage;
import br.selenium.param.CadastroParam;
import io.github.bonigarcia.wdm.ChromeDriverManager;
public class CadastroTest {
    
    WebDriver driver;
    private CadastroPage cadastroPage;
    private CadastroParam cadastroParam;

    @BeforeClass
    public void setUp(){
    ChromeDriverManager.getInstance().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    cadastroPage = new CadastroPage(driver);
    cadastroParam = new CadastroParam();
    }
    @Test(priority = 1)
    public void invalidSearch1(){
    cadastroParam.setNome("joao");
    cadastroParam.setEmail("teste@hotmail.com");
    cadastroParam.setTel("11983845544");
    cadastroParam.setEnd("Rua Augusta ");
    cadastroParam.setEstado("Sao Paulo");
    cadastroParam.setCidade("Sao Paulo");
    cadastroParam.setEscola("Casa Verde");
    cadastroParam.setCalendario("10/08/2017");
    cadastroParam.setHorario("10");
    cadastroPage.buscaCadastro(cadastroParam); 
    Assert.assertFalse(driver.getPageSource().contains("12345"));
    }

}