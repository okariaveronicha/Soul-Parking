import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.comment('Test Case: L002')

WebUI.setText(findTestObject('Object Repository/Login/fieldUsername'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/Login/fieldPassword'), 'BNtL1atTet/WZ0S/944+zg==')

WebUI.click(findTestObject('Object Repository/Login/btnLogin'))

WebUI.verifyTextPresent('Epic sadface: Username and password do not match any user in this service', false)

WebUI.comment('Test Case: L003')

WebUI.setText(findTestObject('Object Repository/Login/fieldUsername'), 'standarduser')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/fieldPassword'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login/btnLogin'))
WebUI.verifyTextPresent('Epic sadface: Username and password do not match any user in this service', false)
WebUI.comment('Test Case: L004')

WebUI.setText(findTestObject('Object Repository/Login/fieldUsername'), 'standarduser')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/fieldPassword'), 'BNtL1atTet/WZ0S/944+zg==')

WebUI.click(findTestObject('Object Repository/Login/btnLogin'))
WebUI.verifyTextPresent('Epic sadface: Username and password do not match any user in this service', false)
WebUI.comment('Test Case: L001')

WebUI.setText(findTestObject('Object Repository/Login/fieldUsername'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/Login/fieldPassword'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login/btnLogin'))

//Robot robot = new Robot()
//
//robot.delay(3000)
//
//robot.keyPress(KeyEvent.VK_ENTER)
//
//robot.keyRelease(KeyEvent.VK_ENTER)
WebUI.verifyTextPresent('Products', false)

WebUI.takeScreenshot()

