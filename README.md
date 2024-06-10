ReadMe file for The Weather App
Name: Zobayer Syed Ahmed
Student number: ST10443422
https://github.com/st10443422-ZobayerAhmed/MyWeatherApplication

Purpose of the app:
The Weather App serves as a practical tool for individuals seeking reliable weather forecasts to plan their weekly activities effectively. By allowing users to input maximum and minimum temperatures, as well as weather conditions, for each day of the week, the app provides a comprehensive overview of the upcoming weather conditions.

Explanation:
The app features three main screens. The first screen displays essential information such as the app logo, the title "Weather App," the developer's name, and student number. It also includes a "Start" button to proceed to the next screen.
The second screen, or the main screen, allows users to input weather data for each day of the week. Users can enter maximum and minimum temperatures, along with weather conditions like sunny, rainy, or overcast. The app calculates the average temperature for the week, providing users with valuable insights into the overall weather trend.
The third screen presents a detailed view of the week's forecast. It displays the entered weather data for each day, along with the average temperature for the week. Additionally, users can navigate back to the main screen using the "Back" button.

Screens:
First Screen:
Logo: Displays the logo of the Weather App at the top.
Background Picture: Background image representing weather-related visuals.
Title: "Weather App"
Name: Your name (Zobayer Syed Ahmed)
Student Number: ST10443422
Start Button: Proceeds to the Second Screen (Main Screen)

Second Screen (Main Screen):
Max Temperature: Plain TextView for users to input maximum temperature for each day of the week.
Min Temperature: Plain TextView for users to input minimum temperature for each day of the week.
Conditions: Plain TextView for users to input weather conditions for each day of the week.
Average Temperature: Displays the calculated average temperature for the week.
Add Button: Calculates and adds the max and min temperatures entered by the user for each day.
Clear Button: Clears all input fields.
View Temperature Button: Proceeds to the Third Screen (Detailed View Screen).

Third Screen (Detailed View Screen):
Logo: Displays the logo of the Weather App at the top.
Background Picture: Background image representing weather-related visuals.
Week Forecast Details: Plain TextViews displaying the forecast details for each day of the week (e.g., Monday: Min Temp, Max Temp, Conditions).
Average Temperature: Displays the average temperature calculated from the data entered on the Second Screen.
Back Button: Returns the user to the Second Screen.

Screenshots:
![Screenshot (64)](https://github.com/st10443422-ZobayerAhmed/MyWeatherApplication/assets/164514671/6d9a4b8d-e22d-4a20-9ae3-4d9058ed7af2)
![Screenshot (71)](https://github.com/st10443422-ZobayerAhmed/MyWeatherApplication/assets/164514671/1a0832af-f2a2-4dca-a0f3-50dd0deabaac)
![Screenshot (63)](https://github.com/st10443422-ZobayerAhmed/MyWeatherApplication/assets/164514671/48864661-3778-4e82-a8bb-0253d3902a32)
![Screenshot (66)](https://github.com/st10443422-ZobayerAhmed/MyWeatherApplication/assets/164514671/638f87cb-4221-4a21-8e3c-0a1fc467c77f)
![Screenshot (61)](https://github.com/st10443422-ZobayerAhmed/MyWeatherApplication/assets/164514671/003eae3b-d832-41b9-8e82-8bd9775b5a6d)
![Screenshot (68)](https://github.com/st10443422-ZobayerAhmed/MyWeatherApplication/assets/164514671/6b555659-57a9-487e-8185-6d934d1c959e)
![Screenshot (67)](https://github.com/st10443422-ZobayerAhmed/MyWeatherApplication/assets/164514671/dc25af70-032c-456c-9746-38dcce3ba0cf)
![Screenshot (62)](https://github.com/st10443422-ZobayerAhmed/MyWeatherApplication/assets/164514671/05ad97c9-2d11-421b-966f-a8d3fee2cf8b)
![Screenshot (65)](https://github.com/st10443422-ZobayerAhmed/MyWeatherApplication/assets/164514671/29cb2257-3295-42f8-bef1-940fed47049e)

Pseudocode:
First Screen:
Display Main Activity with app name, your name, student number and logo
if start button is clicked:
navigate to MainSCreen
if Exit button is clicked:
Close the app


Main Screen:
Initialize a variable named "btnAdd" as a Button object.
Find the Button with the ID "btnAdd" in the current layout and assign it to the variable "btnAdd".
Initialize a variable named "btnClear" as a Button object.
Find the Button with the ID "btnClear" in the current layout and assign it to the variable "btnClear".
Initialize a variable named "btnDetailView" as a Button object.
Find the Button with the ID "btnDetailView" in the current layout and assign it to the variable "btnDetailView".

Initialize a variable named "minTemperatureTextView" as a TextView object and find the TextView with the ID "minTemperatureTextView" in the current layout.
Initialize a variable named "maxTemperatureTextView" as a TextView object and find the TextView with the ID "maxTemperatureTextView" in the current layout.
Initialize a variable named "weatherConditionTextView" as a TextView object and find the TextView with the ID "weatherConditionTextView" in the current layout.

Create an array named "days" containing the days of the week: "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday".
Initialize an array named "minTemps" with a size of 7 to store EditText objects for minimum temperatures.
Initialize an array named "maxTemps" with a size of 7 to store EditText objects for maximum temperatures.
Initialize an array named "conditions" with a size of 7 to store EditText objects for weather conditions.

For each day "i" in the "days" array:
Get the resource ID for the minimum temperature EditText using the day's name.
Get the resource ID for the maximum temperature EditText using the day's name.
Get the resource ID for the weather condition EditText using the day's name.
Assign the EditText objects to the respective arrays for minimum temperature, maximum temperature, and weather condition.

When the "Add" button is clicked:
Initialize variables "sum" and "count" to 0.
Iterate through each day:
Retrieve the minimum and maximum temperatures entered by the user.
If both temperatures are valid:
Calculate the average temperature for the day and add it to "sum".
Increment "count".
If there are valid temperatures:
Calculate the overall average temperature.
Set the text of the "averageTemperature" TextView to display the average.
If no valid temperatures were entered:
Display a toast message prompting the user to enter valid temperatures.

When the "View Temperature" button is clicked:
Create an Intent to navigate to the "detailedViewScreen" activity.
Start the activity using the created Intent.

When the "Clear" button is clicked:
Log a message indicating that the clear button was clicked.
Iterate through each day:
Clear the text in the EditText fields for minimum temperature, maximum temperature, and weather condition.

Third Scree:
Initialize TextViews for weather details and average temperature.
arrays for days, min/max temperatures, and weather conditions.
Retrieve TextViews for weather details and average temperature.
Iterate days:
Check min/max temperatures within 10-45°C range.
Calculate daily average temperature.
Append weather details to TextView.
Calculate overall average temperature.
Display average temperature.
Initialize button for returning to main screen.
Finish current activity on button click to return.




