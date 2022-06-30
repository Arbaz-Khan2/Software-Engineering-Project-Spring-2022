from tkinter.tix import TEXT

# from jmespath import search
from appium import webdriver
from appium.webdriver.common.mobileby import MobileBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time
  
desired_cap = {
    # Set your access credentials
    "browserstack.user" : "ahtishamalijan_GTq0ua",
    "browserstack.key" : "aqJ4qpxdLfL5xz5iJkAs",
  
    # Set URL of the application under test
    "app" : "bs://644ac770072d302cd0e6eea022f935345602130e",
  
    # Specify device and os_version for testing
    "device" : "Google Pixel 3",
    "os_version" : "9.0",
      
    # Set other BrowserStack capabilities
    "project" : "First Python project", 
    "build" : "browserstack-build-1",
    "name" : "Hotels_Rating_test"
}
  
# Initialize the remote Webdriver using BrowserStack remote URL
# and desired capabilities defined above
driver = webdriver.Remote(
    command_executor="http://hub-cloud.browserstack.com/wd/hub", 
    desired_capabilities=desired_cap
)
  
# If you have uploaded your app, write your test case here. 
  
# Test case for the BrowserStack sample Android app. 
# If you have uploaded your app, update the test case here. 
try:
    search_element = WebDriverWait(driver, 30).until(
        EC.element_to_be_clickable((MobileBy.ID, "com.example.gbtrivia:id/bt_button"))
    )
    search_element.click()
    search_element = WebDriverWait(driver, 30).until(
        EC.element_to_be_clickable((MobileBy.ID, "com.example.gbtrivia:id/signup"))
    )
    search_element.click()


    search_element = WebDriverWait(driver, 30).until(
        EC.element_to_be_clickable((MobileBy.ID, "com.example.gbtrivia:id/traveller_signup"))
    )
    search_element.click()

    search_input = WebDriverWait(driver, 30).until(
        EC.element_to_be_clickable((MobileBy.ID, "com.example.gbtrivia:id/username"))
    )
    search_input.send_keys("Ahtisham")

    search_input = WebDriverWait(driver, 30).until(
        EC.element_to_be_clickable((MobileBy.ID, "com.example.gbtrivia:id/email"))
    )
    search_input.send_keys("Ahtisham225ali@gmail.com")

    search_input = WebDriverWait(driver, 30).until(
        EC.element_to_be_clickable((MobileBy.ID, "com.example.gbtrivia:id/confirm_password"))
    )
    search_input.send_keys("Ahtisham")

    search_input = WebDriverWait(driver, 30).until(
        EC.element_to_be_clickable((MobileBy.ID, "com.example.gbtrivia:id/password"))
    )
    search_input.send_keys("Ahtisham")


    search_element = WebDriverWait(driver, 30).until(
        EC.element_to_be_clickable((MobileBy.ID, "com.example.gbtrivia:id/login"))
    )
    search_element.click()
    search_element = WebDriverWait(driver, 30).until(
        EC.element_to_be_clickable((MobileBy.ID, "com.example.gbtrivia:id/view_hotels_button"))
    )
    search_element.click()

    search_element = WebDriverWait(driver, 30).until(
        EC.element_to_be_clickable((MobileBy.ID, "com.example.gbtrivia:id/btnChitral"))
    )
    search_element.click()
    # time.sleep(3)
    # search_results = driver.find_elements_by_class_name("androidx.appcompat.widget.LinearLayoutCompat"[1])[0]
    # search_results.click()
    # search_element = WebDriverWait(driver, 30).until(
    #     EC.element_to_be_clickable((MobileBy.ID, "com.example.gbtrivia:id/title"))
    # )
    # search_element.click()
    
    search_results = driver.find_elements_by_class_name("com.example.gbtrivia:id/hotels_rating")
    if (search_results != []):
        driver.execute_script('browserstack_executor: {"action": "setSessionStatus", "arguments": {"status":"passed", "reason": "Results found!"}}')
    else:
         driver.execute_script('browserstack_executor: {"action": "setSessionStatus", "arguments": {"status":"failed", "reason": "No results found"}}')
except:
    driver.execute_script('browserstack_executor: {"action": "setSessionStatus", "arguments": {"status":"failed", "reason": "No results found"}}')

# Invoke driver.quit() after the test is done to indicate that the test is completed.
driver.quit()