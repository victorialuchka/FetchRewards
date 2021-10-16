package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "weigh")
    private WebElement weightButton;

    @FindBy(xpath = "//button[text()='Reset']")
    private WebElement resetButton;

    @FindBy(xpath = "//button[text()='?']")
    private WebElement resultButton;

    @FindBy(tagName = "li")
    private List<WebElement> weighingList;

    @FindBy(xpath = "//button[@class='square']")
    private List<WebElement> coinList;

    @FindBy(id = "coin_8")
    private WebElement eight;

    @FindBy(id = "left_0")
    private WebElement leftZero;

    @FindBy(id = "left_1")
    private WebElement leftOne;

    @FindBy(id = "left_2")
    private WebElement leftTwo;

    @FindBy(id = "left_3")
    private WebElement leftThree;

    @FindBy(id = "left_4")
    private WebElement leftFour;

    @FindBy(id = "right_0")
    private WebElement rightZero;

    @FindBy(id = "right_1")
    private WebElement rightOne;

    @FindBy(id = "right_2")
    private WebElement rightTwo;

    @FindBy(id = "right_3")
    private WebElement rightThree;

    @FindBy(id = "right_4")
    private WebElement rightFour;

    public WebElement getWeightButton() {
        return weightButton;
    }

    public void setWeightButton(WebElement weightButton) {
        this.weightButton = weightButton;
    }

    public WebElement getResetButton() {
        return resetButton;
    }

    public void setResetButton(WebElement resetButton) {
        this.resetButton = resetButton;
    }

    public WebElement getResultButton() {
        return resultButton;
    }

    public void setResultButton(WebElement resultButton) {
        this.resultButton = resultButton;
    }

    public WebElement getEight() {
        return eight;
    }

    public void setEight(WebElement eight) {
        this.eight = eight;
    }

    public WebElement getLeftZero() {
        return leftZero;
    }

    public void setLeftZero(WebElement leftZero) {
        this.leftZero = leftZero;
    }

    public WebElement getLeftOne() {
        return leftOne;
    }

    public void setLeftOne(WebElement leftOne) {
        this.leftOne = leftOne;
    }

    public WebElement getLeftTwo() {
        return leftTwo;
    }

    public void setLeftTwo(WebElement leftTwo) {
        this.leftTwo = leftTwo;
    }

    public WebElement getLeftThree() {
        return leftThree;
    }

    public void setLeftThree(WebElement leftThree) {
        this.leftThree = leftThree;
    }

    public WebElement getLeftFour() {
        return leftFour;
    }

    public void setLeftFour(WebElement leftFour) {
        this.leftFour = leftFour;
    }

    public WebElement getRightZero() {
        return rightZero;
    }

    public void setRightZero(WebElement rightZero) {
        this.rightZero = rightZero;
    }

    public WebElement getRightOne() {
        return rightOne;
    }

    public void setRightOne(WebElement rightOne) {
        this.rightOne = rightOne;
    }

    public WebElement getRightTwo() {
        return rightTwo;
    }

    public void setRightTwo(WebElement rightTwo) {
        this.rightTwo = rightTwo;
    }

    public WebElement getRightThree() {
        return rightThree;
    }

    public void setRightThree(WebElement rightThree) {
        this.rightThree = rightThree;
    }

    public WebElement getRightFour() {
        return rightFour;
    }

    public void setRightFour(WebElement rightFour) {
        this.rightFour = rightFour;
    }

    public List<WebElement> getWeighingList() {
        return weighingList;
    }

    public void setWeighingList(List<WebElement> weighingList) {
        this.weighingList = weighingList;
    }

    public List<WebElement> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<WebElement> coinList) {
        this.coinList = coinList;
    }
}
