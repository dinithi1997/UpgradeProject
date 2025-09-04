import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hmesprimerywebqa.azurewebsites.net/HMES/home')

WebUI.verifyElementText(findTestObject('Page_Login/div_SignIn'), 'Sign in')

WebUI.setText(findTestObject('Page_Login/input_SignInEmail'), 'Dinithi.Anupama@hirdaramani.com')

WebUI.verifyMatch('Dinithi.Anupama@hirdaramani.com', 'Dinithi.Anupama@hirdaramani.com', true)

WebUI.click(findTestObject('Page_Login/button_SignIn'))

WebUI.verifyElementText(findTestObject('Page_Login/div_Password'), 'Enter password')

WebUI.setEncryptedText(findTestObject('Page_Login/input_EnterPassword'), 'GA8dOj7ubeRtlgf9qHBmVg==')

WebUI.verifyMatch('7ujm&UJM', '7ujm&UJM', true)

WebUI.click(findTestObject('Page_Login/button_SignIn'))

WebUI.click(findTestObject('Page_Login/button_SignIn'))

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.verifyTextPresent('Welcome Back', true)

WebUI.verifyElementText(findTestObject('Page_Login/div_Site'), 'Site')

WebUI.click(findTestObject('Page_Login/div_SiteDropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Login/span_Please Select a Site'))

