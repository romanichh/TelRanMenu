import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TelRanMenu extends TestBase{

    @Test
    public void TelRanMenuTest() throws InterruptedException {
        openSite("https://www.tel-ran.com/\n");
        driver.manage().window().maximize();
        click(By.cssSelector("#comp-k2d3m6ja1bg"));
        Thread.sleep(6000);
        String elementText = getText(By.xpath("//*[@id='comp-k2iv941f']"));
        System.out.println(elementText);
        click(By.xpath("//*[@id='comp-k2d3m6ja2label']"));
        String elemntCourse = getText(By.cssSelector("#comp-k2lwlhsp"));
        System.out.println(elemntCourse);
        click(By.xpath("//*[@id='comp-k2d3m6ja3label']"));
        String work = getText(By.xpath("//*[@id='comp-k2yjzeum']"));
        System.out.println(work);
        click(By.xpath("//*[@id='comp-k2d3m6ja4label']"));
        String reviews = getText(By.xpath("//*[@id='comp-k2yoaibp']"));
        System.out.println(reviews);
        click(By.cssSelector("#comp-k2d3m6ja5bg"));
        String blog = getText(By.cssSelector("#comp-k2yqvjis"));
        System.out.println(blog);
        click(By.xpath("//*[@id='comp-k2d3m6ja6label']"));
        String contacts = getText(By.xpath("//*[@id='comp-k2ysntl7']"));
        System.out.println(contacts);

    }

    private String getText(By Text) {
        return driver.findElement(Text).getText();
    }


}
