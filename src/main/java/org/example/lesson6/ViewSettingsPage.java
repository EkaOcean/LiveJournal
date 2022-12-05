package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ViewSettingsPage extends AbstractPage{

    public ViewSettingsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "LJ__Setting__TimeZone_timezone")
    private WebElement timezone;

    public void changeTimeZone(String region){
        this.timezone.click();
        this.timezone.sendKeys(region);
    }

    @FindBy(id = "LJ__Setting__ImagePlaceholders_check1")
    private WebElement imageincommentscheckbox;

    public void imageReplacement(){
        this.imageincommentscheckbox.click();
    }

    @FindBy(id = "LJ__Setting__EmbedPlaceholders_check1")
    private WebElement videoincommentscheckbox;

    public void videoReplacement(){
        this.videoincommentscheckbox.click();
    }

    @FindBy(id = "LJ__Setting__EmailFormat_emailformat_plaintext")
    private WebElement simpletextradiobutton;

    public void setLettersFormat(){
        this.simpletextradiobutton.click();
    }

    @FindBy(id = "LJ__Setting__Post2017_post2017")
    private WebElement yescheckbox;

    public void setCurrentEditor(){
        this.yescheckbox.click();
    }

    @FindBy(id = "LJ__Setting__MobAdaptive_cmobadv")
    private WebElement maladaptivestylecheckbox;

    public void setAdaptationForMobile(){
        this.maladaptivestylecheckbox.click();
    }

    @FindBy(id = "LJ__Setting__EndlessScroll_endscrl")
    private WebElement scrollcommentsmobilecheckbo;

    public void setPostPage(){
        this.scrollcommentsmobilecheckbo.click();
    }

    @FindBy(id = "LJ__Setting__StyleMine_stylemine")
    private WebElement readcommentsfriendspagecheckbox;

    public void setCommentsPage(){
        this.readcommentsfriendspagecheckbox.click();
    }

    @FindBy(id = "LJ__Setting__AdultContent_adultcontent")
    private WebElement adultscontentcheckbox;

    public void setAdultsContent(){
        this.adultscontentcheckbox.click();
    }

    @FindBy(id = "LJ__Setting__ViewingAdultContent_viewingadultcontent")
    private WebElement hideadultscontentcheckbox;

    public void setViewingAdultsContent(){
        this.hideadultscontentcheckbox.click();
    }

    @FindBy(id = "LJ__Setting__SafeSearch_safesearch")
    private WebElement excludeadultscontentcheckbox;

    public void setSafeSearch(){
        this.excludeadultscontentcheckbox.click();
    }

    @FindBy(id = "LJ__Setting__HideFriendsReposts_hidefriendsreposts")
    private WebElement hidefriendsrepostscheckbox;

    public void setFriendsReposts(){
        this.hidefriendsrepostscheckbox.click();
    }

    @FindBy(id = "LJ__Setting__TheEye_the_eye_show")
    private WebElement eyesshowcheckbox;

    public void setEyesShow(){
        this.eyesshowcheckbox.click();
    }

    @FindBy(id = "LJ__Setting__CyrillicServices_cyrillicservices")
    private WebElement cyrillicservicescheckbox;

    public void setCyrillicServices(){
        this.cyrillicservicescheckbox.click();
    }

    @FindBy(id = "LJ__Setting__LikesToComments_likes2comments")
    private WebElement likes2commentscheckbox;

    public void setLikes2Comments(){
        this.likes2commentscheckbox.click();
    }

    @FindBy(css = ".b-flatbutton")
    private WebElement savesettingpage;

    public void saveSettingPage(){
        this.savesettingpage.click();
    }

}
