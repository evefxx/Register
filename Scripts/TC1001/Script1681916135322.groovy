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

WebUI.navigateToUrl('https://www.9experttraining.com/register-inhouse')

WebUI.click(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/button_'))

WebUI.click(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/span_'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/select_- None - AI Builder in Power Platfor_361b95'), 
    '980', true)

WebUI.setText(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/textarea__field_reg_locationund0value'), 
    '-')

WebUI.setText(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/input__field_reg_numberund0value'), '1')

WebUI.setText(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/input__field_reg_nameund0value'), 'จดหมาย รัก')

WebUI.setText(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/input__field_reg_positionund0value'), 'ผู้จัดการ')

WebUI.setText(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/input__field_reg_departmentund0value'), 
    'ผลิต')

WebUI.setText(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/input__field_reg_company_nameund0value'), 
    'จดหมายจำกัด')

WebUI.setText(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/textarea__field_reg_address_receiptund0value'), 
    '-')

WebUI.setText(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/input_-_field_reg_phoneund0value'), '0220789456')

WebUI.setText(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/input__field_reg_mobileund0value'), '0891234567')

WebUI.setText(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/input__field_reg_emailund0email'), 'love123@gamil.com')

WebUI.setText(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/textarea__field_reg_notesund0value'), '-')

WebUI.setText(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/input__captcha_response'), '15')

WebUI.click(findTestObject('Object Repository/Page_(Inhouse)  9Expert Training/input_5  4,  9_op'))

WebUI.closeBrowser()

