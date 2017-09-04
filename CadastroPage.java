package br.selenium.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.selenium.param.CadastroParam;



public class CadastroPage {
    
        private static final Logger LOG = LoggerFactory.getLogger(CadastroPage.class);
        private WebDriver driver;
        public CadastroPage(WebDriver driver){
        this.driver = driver;
        }
        public void buscaCadastro(CadastroParam cadastroParam){
        try{
        driver.get("http://www.skill.com.br/quero-04-aulas");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.findElement(By.xpath("//*[@id='formQueroDesconto1']/div[1]/input")).sendKeys(cadastroParam.getNome());
        driver.findElement(By.xpath("//*[@id='formQueroDesconto1']/div[2]/input")).sendKeys(cadastroParam.getEmail());
        driver.findElement(By.xpath("//*[@id='formQueroDesconto1']/div[3]/input")).sendKeys(cadastroParam.getTel());
        driver.findElement(By.xpath("//*[@id='formQueroDesconto1']/div[4]/input")).sendKeys(cadastroParam.getEnd());
        Thread.sleep(2000);  
        driver.findElement(By.xpath("//*[@id='formQueroDesconto1']/div[4]/input")).sendKeys(Keys.chord(Keys.ARROW_DOWN ));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='formQueroDesconto1']/div[4]/input")).sendKeys(Keys.chord(Keys.ENTER));
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='formQueroDesconto1']/div[7]/span/span[1]/span/span[2]")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(cadastroParam.getEscola());
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.chord(Keys.ARROW_DOWN ));
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.chord(Keys.ENTER));
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='formQueroDesconto1']/div[8]/button")).click();
        Thread.sleep(10000);
        System.out.println("clicou botao");
        driver.findElement(By.xpath("//*[@id='reportrange']/div/div[1]/table/tbody/tr[2]/td[5]")).click();
        System.out.println("clicou data");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='select2-QDHorarios-container']")).click();
        System.out.println("clicou horario");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(cadastroParam.getHorario());
        Thread.sleep(4000);
        System.out.println("setou valor");
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.chord(Keys.ARROW_DOWN ));
        System.out.println("colocou horario e seta pra baixo");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.chord(Keys.ENTER));
        System.out.println("deu enter");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='formBuscaHorarios']/div[3]/button")).click();
      
        
        
        
        }catch(Exception e){
        LOG.error("[Cadastra Aluno Page] Erro ao cadastrar aluno: " + e.getCause());
        }
}}