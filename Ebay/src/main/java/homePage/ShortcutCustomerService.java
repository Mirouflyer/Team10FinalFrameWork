package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class ShortcutCustomerService extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Buy')]")
    public static WebElement buyWebElement;

    @FindBy(xpath = "//a[contains(text(),'Registration')]")
    public static WebElement regustrationWebElement;

    @FindBy(xpath = "//a[contains(text(),'eBay Money Back Guarantee')]")
    public static WebElement eBayMoneyBackGuaranteeWebElement;

    @FindBy(xpath = "//a[contains(text(),'Bidding & buying help')]")
    public static WebElement berlduigBuyingHelpWebElement;

    @FindBy(xpath = "//a[contains(text(),'Stores')]")
    public static WebElement storesWebElement;

    @FindBy(xpath = "//a[@class='gf-bttl thrd'][contains(text(),'Sell')]")
    public static WebElement sellWebElement;

    @FindBy(xpath = "//a[contains(text(),'Start selling')]")
    public static WebElement startSellingWebElement;

    @FindBy(xpath = "//a[contains(text(),'How to sell')]")
    public static WebElement howToSellWebElement;

    @FindBy(xpath = "//a[contains(text(),'Business sellers')]")
    public static WebElement businessSellersWebElement;

    @FindBy(xpath = "//a[@class='thrd'][contains(text(),'Affiliates')]")
    public static WebElement affiliatesWebElement;

    @FindBy(xpath = "//h3[contains(text(),'Tools & apps')]")
    public static WebElement toolsAndAppsWebElement;

    @FindBy(xpath = "//a[contains(text(),'Mobile apps')]")
    public static WebElement mobileAppsWebElement;

    @FindBy(xpath = "//a[contains(text(),'Developers')]")
    public static WebElement developersWebElement;

    @FindBy(xpath = "//a[contains(text(),'Security center')]")
    public static WebElement securityCenterWebElement;

    @FindBy(xpath = "//a[contains(text(),'eBay official time')]")
    public static WebElement eBayOfficialTimeWebElement;

    @FindBy(xpath = "//a[contains(text(),'Site map')]")
    public static WebElement siteMapWebElement;

    @FindBy(xpath = "//a[contains(text(),'eBay Classifieds')]")
    public static WebElement ebayClassifiesWebElement;

    @FindBy(xpath = "//a[contains(text(),'StubHub')]")
    public static WebElement stubHubWebElement;

    @FindBy(xpath = "//a[contains(text(),'See all companies')]")
    public static WebElement seeAllCompaniesWebElement;

    @FindBy(xpath = "//a[contains(text(),\"eBay's Blogs\")]")
    public static WebElement ebayBlogsWebElement;

    @FindBy(xpath = "//a[contains(text(),'Facebook')]")
    public static WebElement facebookBlogWebElement;

    @FindBy(xpath = "//a[contains(text(),'Twitter')]")
    public static WebElement twitterBlogWebElement;

    @FindBy(xpath = "//a[@class='gf-bttl thrd'][contains(text(),'About eBay')]")
    public static WebElement aboutEbayWebElement;

    @FindBy(xpath = "//a[contains(text(),'Company info')]")
    public static WebElement companyInfoWebElement;

    @FindBy(xpath = "//a[contains(text(),'News')]")
    public static WebElement newsWebElement;

    @FindBy(xpath = "//a[contains(text(),'Investors')]")
    public static WebElement investorsWebElement;

    @FindBy(xpath = "//a[contains(text(),'Careers')]")
    public static WebElement careersWebElement;

    @FindBy(xpath = "//a[contains(text(),'Diversity & Inclusion')]")
    public static WebElement diversityAndInclusionWebElement;

    @FindBy(xpath = " //a[contains(text(),'Global Impact')]")
    public static WebElement globalImpactWebElement;

    @FindBy(xpath = "//a[contains(text(),'Government relations')]")
    public static WebElement governmentRelationsWebElement;

    @FindBy(xpath = "//a[contains(text(),'Advertise with us')]")
    public static WebElement advertiseWebElement;

    @FindBy(xpath = "//a[@class='thrd'][contains(text(),'Policies')]")
    public static WebElement policiesWebElement;

    @FindBy(xpath = "//a[contains(text(),'Verified Rights Owner (VeRO) Program')]")
    public static WebElement verifiedRightsWebElement;

    @FindBy(xpath = "//a[@class='gf-bttl thrd'][contains(text(),'Help & Contact')]")
    public static WebElement helpAndContactWebElement;

    @FindBy(xpath = "//a[@class='thrd'][contains(text(),'Resolution Center')]")
    public static WebElement resolutionCenterWebElement;

    @FindBy(xpath = "//a[@class='thrd'][contains(text(),'Seller Center')]")
    public static WebElement sellerCenterWebElement;

    @FindBy(xpath = "//a[contains(text(),'Contact us')]")
    public static WebElement contactUsWebElement;

    @FindBy(xpath = "//a[contains(text(),'eBay Returns')]")
    public static WebElement ebayReturnsWebElement;

    @FindBy(xpath = "//a[@class='gf-bttl thrd'][contains(text(),'Community')]")
    public static WebElement communityWebElement;

    @FindBy(xpath = "//a[@class='thrd'][contains(text(),'Announcements')]")
    public static WebElement announcementsWebElement;

    @FindBy(xpath = "//a[contains(text(),'Knowledge Base')]")
    public static WebElement knowledgeBaseWebElement;

    @FindBy(xpath = "//a[contains(text(),'Discussion boards')]")
    public static WebElement discussionBoardsWebElement;

    @FindBy(xpath = "//a[contains(text(),'eBay for Charity')]")
    public static WebElement ebayForCharityWebElement;

    @FindBy(xpath = "//a[contains(text(),'Charity Shop')]")
    public static WebElement charityShopWebElement;

    @FindBy(xpath = "//a[contains(text(),'eBay Community')]")
    public static WebElement ebayCommunityWebElement;

    public static WebElement getBuyWebElement() {
        return buyWebElement;
    }

    public static WebElement getRegustrationWebElement() {
        return regustrationWebElement;
    }

    public static WebElement geteBayMoneyBackGuaranteeWebElement() {
        return eBayMoneyBackGuaranteeWebElement;
    }

    public static WebElement getberlduigBuyingHelpWebElement() {
        return berlduigBuyingHelpWebElement;
    }

    public static WebElement getStoresWebElement() {
        return storesWebElement;
    }

    public static WebElement getSellWebElement() {
        return sellWebElement;
    }

    public static WebElement getStartSellingWebElement() {
        return startSellingWebElement;
    }

    public static WebElement getHowToSellWebElement() {
        return howToSellWebElement;
    }

    public static WebElement getBusinessSellersWebElement() {
        return businessSellersWebElement;
    }

    public static WebElement getAffiliatesWebElement() {
        return affiliatesWebElement;
    }

    public static WebElement getToolsAndAppsWebElement() {
        return toolsAndAppsWebElement;
    }

    public static WebElement getMobileAppsWebElement() {
        return mobileAppsWebElement;
    }

    public static WebElement getDevelopersWebElement() {
        return developersWebElement;
    }

    public static WebElement getSecurityCenterWebElement() {
        return securityCenterWebElement;
    }

    public static WebElement geteBayOfficialTimeWebElement() {
        return eBayOfficialTimeWebElement;
    }

    public static WebElement getSiteMapWebElement() {
        return siteMapWebElement;
    }

    public static WebElement getEbayClassifiesWebElement() {
        return ebayClassifiesWebElement;
    }

    public static WebElement getStubHubWebElement() {
        return stubHubWebElement;
    }

    public static WebElement getSeeAllCompaniesWebElement() {
        return seeAllCompaniesWebElement;
    }

    public static WebElement getEbayBlogsWebElement() {
        return ebayBlogsWebElement;
    }

    public static WebElement getFacebookBlogWebElement() {
        return facebookBlogWebElement;
    }

    public static WebElement getTwitterBlogWebElement() {
        return twitterBlogWebElement;
    }

    public static WebElement getAboutEbayWebElement() {
        return aboutEbayWebElement;
    }

    public static WebElement getCompanyInfoWebElement() {
        return companyInfoWebElement;
    }

    public static WebElement getNewsWebElement() {
        return newsWebElement;
    }

    public static WebElement getInvestorsWebElement() {
        return investorsWebElement;
    }

    public static WebElement getCareersWebElement() {
        return careersWebElement;
    }

    public static WebElement getDiversityAndInclusionWebElement() {
        return diversityAndInclusionWebElement;
    }

    public static WebElement getGlobalImpactWebElement() {
        return globalImpactWebElement;
    }

    public static WebElement getGovernmentRelationsWebElement() {
        return governmentRelationsWebElement;
    }

    public static WebElement getAdvertiseWebElement() {
        return advertiseWebElement;
    }

    public static WebElement getPoliciesWebElement() {
        return policiesWebElement;
    }

    public static WebElement getVerifiedRightsWebElement() {
        return verifiedRightsWebElement;
    }

    public static WebElement getHelpAndContactWebElement() {
        return helpAndContactWebElement;
    }

    public static WebElement getResolutionCenterWebElement() {
        return resolutionCenterWebElement;
    }

    public static WebElement getSellerCenterWebElement() {
        return sellerCenterWebElement;
    }

    public static WebElement getContactUsWebElement() {
        return contactUsWebElement;
    }

    public static WebElement getEbayReturnsWebElement() {
        return ebayReturnsWebElement;
    }

    public static WebElement getCommunityWebElement() {
        return communityWebElement;
    }

    public static WebElement getAnnouncementsWebElement() {
        return announcementsWebElement;
    }

    public static WebElement getKnowledgeBaseWebElement() {
        return knowledgeBaseWebElement;
    }

    public static WebElement getDiscussionBoardsWebElement() {
        return discussionBoardsWebElement;
    }

    public static WebElement getEbayForCharityWebElement() {
        return ebayForCharityWebElement;
    }

    public static WebElement getCharityShopWebElement() {
        return charityShopWebElement;
    }

    public static WebElement getEbayCommunityWebElement() {
        return ebayCommunityWebElement;
    }



    public void clickOnBuyWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getBuyWebElement().click();
    }

    public void clickOn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getBuyWebElement().click();
    }
    public void clickOnRegustrationWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getRegustrationWebElement().click();
    }
    public void clickOnEbayMoneyBackGuaranteeWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        geteBayMoneyBackGuaranteeWebElement().click();
    }
    public void clickOnBelduigBuyingHelpWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getberlduigBuyingHelpWebElement().click();
    }

    public void clickOnStoresWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getStoresWebElement().click();
    }

    public void clickOnSellWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSellWebElement().click();
    }
    public void clickOnStartSellingWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getStartSellingWebElement().click();
    }
    public void clickOnHowToSellWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getHowToSellWebElement().click();
    }
    public void clickOnBusinessSellersWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getBusinessSellersWebElement().click();
    }
    public void clickOnAffiliatesWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAffiliatesWebElement().click();
    }
    public void clickOnToolsAndAppsWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getToolsAndAppsWebElement().click();
    }
    public void clickOnMobileAppsWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getMobileAppsWebElement().click();
    }
    public void clickOnDevelopersWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getDevelopersWebElement().click();
    }
    public void clickOnSecurityCenterWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSecurityCenterWebElement().click();
    }
    public void clickOnEbayOfficialTimeWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        geteBayOfficialTimeWebElement().click();
    }
    public void clickOnSiteMapWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSiteMapWebElement().click();
    }
    public void clickOnEbayClassifiesWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getEbayClassifiesWebElement().click();
    }
    public void clickOnStubHubWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getStubHubWebElement().click();
    }
    public void clickOnSeeAllCompaniesWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSeeAllCompaniesWebElement().click();
    }
    public void clickOnEbayBlogsWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getEbayBlogsWebElement().click();
    }
    public void clickOnFacebookBlogWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getFacebookBlogWebElement().click();
    }
    public void clickOnTwitterBlogWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getTwitterBlogWebElement().click();
    }
    public void clickOnAboutEbayWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAboutEbayWebElement().click();
    }
    public void clickOnCompanyInfoWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCompanyInfoWebElement().click();
    }
    public void clickOnNewsWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getNewsWebElement().click();
    }
    public void clickOnInvestorsWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getInvestorsWebElement().click();
    }
    public void clickOnCareersWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCareersWebElement().click();
    }
    public void clickOnDiversityAndInclusionWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getDiversityAndInclusionWebElement().click();
    }
    public void clickOnGlobalImpactWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getGlobalImpactWebElement().click();
    }
    public void clickOnGovernmentRelationsWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getGovernmentRelationsWebElement().click();
    }
    public void clickOnAdvertiseWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAdvertiseWebElement().click();
    }
    public void clickOnPoliciesWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getPoliciesWebElement().click();
    }
    public void clickOnVerifiedRightsWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getVerifiedRightsWebElement().click();
    }
    public void clickOnHelpAndContactWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getHelpAndContactWebElement().click();
    }
    public void clickOnResolutionCenterWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getResolutionCenterWebElement().click();
    }
    public void clickOnSellerCenterWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getBuyWebElement().click();
    }
    public void clickOnContactUsWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getContactUsWebElement().click();
    }
    public void clickOnEbayReturnsWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getEbayReturnsWebElement().click();
    }
    public void clickOnCommunityWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCommunityWebElement().click();
    }
    public void clickOnAnnouncementsWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAnnouncementsWebElement().click();
    }
    public void clickOnKnowledgeBaseWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getKnowledgeBaseWebElement().click();
    }
    public void clickOnDiscussionBoardsWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getDiscussionBoardsWebElement().click();
    }
    public void clickOnEbayForCharityWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getEbayForCharityWebElement().click();
    }
    public void clickOnCharityShopWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCharityShopWebElement().click();
    }
    public void clickOnEbayCommunityWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getEbayCommunityWebElement().click();
    }
}