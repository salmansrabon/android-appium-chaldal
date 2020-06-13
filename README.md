# Android-appium-chaldal
These steps are executed:

- Open/install Chaldal Application on your device
- Search for item “toothbrush”
- Scroll down to an item and Open Item screen
- Click Plus (+) icon 3 time to add in cart.
- Go to cart screen from the top
- Click Minus (-) icon to empty the card
- Verify Text “Nothing to see here” on cart screen after remove items
- Close the application

## Requirements:
1. Need to have android sdk and Jdk 1.8
2. Need to install appium server

## Run the app
1. Install ChalDal app to your android phone from <a href="https://play.google.com/store/apps/details?id=com.chaldal.poached">playstore</a> 
2. Connect your phone with USB cable with pc
3. Enable USB debugging
4. Check from CMD if device is connected
'''sh
adb devices
'''
5. Start appium server
6. Open the project with IntelIJ
7. Import the dependency fom gradle
8. Click on "Play" button

See the automation <a href="https://www.youtube.com/watch?v=DLfScKAlm2A" target="_blank">video</a> here
