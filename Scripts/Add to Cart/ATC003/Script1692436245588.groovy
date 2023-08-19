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

WebUI.callTestCase(findTestCase('Login/L001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Add to Cart/btnAdd to cart'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Add to Cart/btnRemove'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Add to Cart/Cart'))

WebUI.verifyTextPresent('Your Cart', false)

WebUI.navigateToUrl('https://www.saucedemo.com/cart.html')

WebUI.click(findTestObject('Object Repository/Add to Cart/btnCheckout'))

WebUI.verifyTextPresent('Checkout: Your Information', false)

WebUI.setText(findTestObject('Object Repository/Add to Cart/fieldFirstName'), 'Okaria Veronicha')

WebUI.setText(findTestObject('Object Repository/Add to Cart/fieldLastName'), 'Simanjuntak')

WebUI.setText(findTestObject('Object Repository/Add to Cart/fieldPostalCode'), '12920')

WebUI.scrollToElement(findTestObject('Add to Cart/btnContinue'), 0)

WebUI.click(findTestObject('Object Repository/Add to Cart/btnContinue'))

WebUI.verifyTextPresent('Payment Information', false)

WebUI.scrollToElement(findTestObject('Add to Cart/btnFinish'), 0)

WebUI.click(findTestObject('Object Repository/Add to Cart/btnFinish'))

WebUI.verifyTextPresent('Thank you for your order!', false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Add to Cart/btnBack Home'))

