## ⏳ Selenium Automation - Implementing Waiting Strategy in Automation Framework

In UI test automation, one of the biggest challenges is dealing with dynamic web elements — they don't always load instantly, and using Thread.sleep() often leads to slow and flaky tests.
To make my framework faster and more reliable, I implemented a waiting strategy using both implicit waits and a reusable explicit wait utility class (WaitUtil). 

This approach made:  
- Cleaner code  
- Faster execution  
- Fewer false failures  

---

### Why a Waiting Strategy Is Crucial:  
1. Handles dynamic page loads and AJAX calls  
2. Reduces flaky test failures  
3. Makes scripts faster and more efficient than Thread.sleep()  
4. Enables smart, condition-based synchronization  
5. Essential for stable CI execution  

---

### Project Structure:  

<img width="428" alt="" src="https://github.com/user-attachments/assets/d837e9c7-cab5-4b51-bb8c-3dce4994051e" />

---

### What I Implemented:  

1. Implicit Wait (Global Level)
- Set once during driver initialization:  
  - Automatically waits for seconds specified in the properties file for elements to appear  
<img width="1593" alt="" src="https://github.com/user-attachments/assets/a3050651-5642-478b-9f67-6962ba3170f9" />  
  <br><br>

2. Reusable Wait Utility Method  (WaitUtil.java)  
<img width="1465" alt="" src="https://github.com/user-attachments/assets/d362ca80-6d60-4641-bd37-64ff182bf335" />
  <br><br>

3. Using Explicit Wait:
- Use the explicit wait method for elements  
  - Best for dynamic elements, modals, loaders, and AJAX  
<img width="1465" alt="" src="https://github.com/user-attachments/assets/a21f5875-adcb-46a0-83aa-a4971465c6ce" />

---

### Steps To Run:
1. Create and Clone the project to selenium-automation-implementing-selenium-explicit-and-implicit-wait folder
```
git clone https://github.com/amulsinfal/selenium-automation-implementing-selenium-explicit-and-implicit-wait.git
```
2. Go to the folder selenium-automation-implementing-selenium-explicit-and-implicit-wait containing the testng.xml file.
```
cd selenium-automation-implementing-selenium-explicit-and-implicit-wait
```
3. Open command prompt from this location and Run maven command in command prompt.
```
 mvn test
```

<img width="1436" alt="WindowsTerminal_ER5FnWy7op" src="https://github.com/user-attachments/assets/1149da30-bf51-45db-aa02-6378128e8fe0" />

---

### 🎯 Benefits:
✅ Fewer flaky failures on slower environments  
✅ Clear control over timeout and conditions  
✅ Cleaner code with reusable wait utilities  
✅ Framework now handles real-time delays more gracefully  
