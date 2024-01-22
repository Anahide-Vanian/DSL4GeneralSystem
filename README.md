# Project README

## Customized DSL for control across diverse systems

Programming systems that have a high software component often presents a challenge, as it requires a level of expertise that can be a barrier for domain experts lacking a technical background in the system's domain. 
Skilled professionals may find it challenging to use the full potential of systems within their domain due to a gap in programming knowledge. 
This project seeks to overcome this challenge by offering a user-friendly solution, a high-level Domain-Specific Language (DSL) designed for programming any system without the need for deep technical understanding.

This DSL has been implemented using the Xtext framework in association with the Eclipse application.
By exploiting this DSL, users can create scenarios in natural language, following the syntax rules outlined in the Xtext grammar file.
The use of natural language simplifies the programming of system behavior, empowering users without extensive technical expertise to configure and customize system functionality within their domain.

The solution is composed of three distinct layers as described in the schema below:

![image](https://github.com/Anahide-Vanian/DSL4Students/assets/72527140/a348ed6f-d2e4-4199-949b-2800e5568566)


- The first level corresponds to the DSL itself, containing the specifications of the language and its grammar rules. Once the end-user learns the grammar and syntax rules, he can create scenarios to define the desired system behavior.

- The second level makes use of the Behave framework, which is employed to translate the DSL into low-level code understandable and executable by the hardware.

- Finally, the last layer contains the library or communication tools to interact with the real system.

This implemented DSL is generic and can be applied to any system. To make it work on a specific system, the second and third layers are subject to changes.

Concerning the middle level:
The "Environment.json" file must be modified to contain the principal data or properties associated with the system and additional environment variables to perform the desired behavior. The python files, "tests.py" and "environment.py," should include the library associated with the system and specific methods to control it.

Concerning the last level:
The specific system and its library must be installed and bound to the project.


### Example provided:

To demonstrate the DSL's functionality, we present a example scenario where a virtual character creates and draws a square in a pop-up window. 
The character starts by drawing a straight line from a starting point, followed by drawing another line of equal length at a 90-degree angle from the endpoint of the first line. 
This process is repeated two more times, allowing the character to complete the square. 

The implementation of this solution involved utilizing an external library, easily installable through the `pip` command.
The `Turtle library`, a Python module, provides a straightforward approach to generating graphics and drawings. It employs a turtle-like cursor controlled by specific commands, providing users with an interactive means to explore programming basics visually.

In this example, as the virtual character draws the square, text dynamically appears at each corner to signify the character's position. Simultaneously, additional on-screen text informs the user about the process's location and state.


#### Overview of Technologies

The project utilizes various technologies:
- **Xtext:** Implements syntax, known for developing domain-specific languages.
- **Behavior-Driven Development (BDD) and Gherkin syntax:** Allows users to write scenarios and define system behavior.
- **Behave:** Processes syntax and translates it into executable code.
- **" AnySystemLibrary": Any necessary communication tool or system library:** Enables real-time communication with the system.
- **System and additional equipment:** Used for scenario execution in real-time.

### Setup Process

Follow the instructions below to set up and run the project:

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Anahide-Vanian/DSL4GeneralSystemApplication.git
   ```
2. **Install Eclipse:**
   - Download and install the latest version of Eclipse from [eclipse.org](https://www.eclipse.org/downloads/).

3. **Install Xtext Plugin:**
   - Open Eclipse and go to `Help -> Eclipse Marketplace`.
   - Search for "Xtext" and install the Xtext plugin.

4. **Import Project into Eclipse:**
   - Open Eclipse and choose `File -> Import -> General -> Existing Projects into Workspace`.
   - Select the cloned `DSL4GeneralSystemApplication` project directory.
     
5. **Install Python Extensions:**

Since the project includes Python source code, ensure you have Python extensions installed. Follow these steps:
   - Open Eclipse and go to `Help -> Eclipse Marketplace`
   - Type "PyDev" into the search bar.
   - Follow the instructions to install the PyDev plugin.
  
6. **Install Python Interpreter:**

The Python interpreter path is typically configured by default in the IDE. However, if you encounter issues related to the Python interpreter, follow these steps:

   - Open Eclipse and navigate to `Window -> Preferences -> PyDev -> Interpreters -> Python Interpreter -> New`.
   - Now, you should see a list of configured Python interpreters. If none is configured, the list will be empty.
   - Click on "Browse for python/pypy exe" and navigate to the directory where your Python executable is located. Choose the Python executable file, such as "python.exe" on Windows or "python" on Unix-like systems.
   - If you're unsure about the path to your Python installation, you can opt for "Config first in PATH." This option enables the application to automatically discover the default Python path registered in your file system.
   - Click the "OK" button to confirm your selections.

7.  **Install Gherkin Syntax Extensions:**

The project involves writing files with a ".feature" extension following the Gherkin Syntax, processed by the behave framework. Make sure to install the required extensions for Gherkin Syntax by following these steps:
   - Open Eclipse and navigate to `Help -> Eclipse Marketplace`.
   - In the Eclipse Marketplace dialog, type "Cucumber" into the search bar.
   - Locate the "Cuncumber Eclipse Plugin" plugin for Eclipse in the search results.
   - Follow the instructions to install the "Cuncumber Eclipse Plugin" plugin.

### External Libraries 

To control the system, you will probably need to install an interface or library on your PC. 
If you can, the best way is to install it using `pip` and follow these steps:

1. **Install `AnySystemLibrary`:**
 Open your command-line interface (such as the terminal on Linux/Mac or Command Prompt on Windows) and enter the following command:

   ```bash
   pip install AnySystemLibrary
   ```
   
   Warning : “AnySystemLibrary” is a fictitious name and provided as an example. You have to replace “AnySystemLibrary” by the name of the library associated with the specific system you want to control.
   In the provided example, “AnySystemLibrary” must be replaced by “PythonTurtle”.

2. **Install Behave:**
   
To install Behave on your computer using `pip`, open your command-line interface and follow these simple steps.

```bash
pip install behave
```

Press "Enter" to execute the command. Pip will automatically download and install Behave and its dependencies. Once the installation is complete, you can verify it by checking the installed version:

```bash
behave --version
```

If AnySystemLibrary and Behave have been successfully installed using `pip`, the IDE should locate any imports from these libraries. However, if you encounter issues finding file locations during execution, follow these steps:

   - Open Eclipse and go to `Window -> Preferences -> PyDev -> Interpreters -> Python Interpreter -> Libraries`.
   - Add the path of the `site-packages` directory associated with your Python installation. Including the path `site-packages` will ensure that the IDE can effectively identify and utilize the Behave and `AnySystemLibrary` libraries.


### Code Execution for the Provided Example
To run the code for the provided example:

Navigate to `/dk.sdu.bdd.xtext.examples/src/dk/sdu/bdd/xtext/examples/features`.
Open the 'main.py' file and click on "Run" to execute it.

### Code Execution with Environment Changes
1. **Environment Setup**:

   - Open `dk.sdu.bdd.xtext.examples/src/dk/sdu/bdd/xtext/examples/features/` and edit the "Environment.json" file.
   - This file contains crucial data and properties associated with the system and environment.
   - Customize the file with your specific data, including the system name, task step size, velocity values, etc.

2. **Scenario Definition**
   - Navigate to `/dk.sdu.bdd.xtext.examples/src/dk/sdu/bdd/xtext/examples` to locate the `sample.bdd` file.
   - Create your own scenario adhering to the DSL's grammar rules. The grammar rules are outlined in the "BddDsl.xtext" file, accessible under `/dk.sdu.bdd.text/src/dk/sdu/bdd/xtext/`. When writing your scenario, ensure compliance with the keywords defined in the "Environment.json" file to identify entities, their states, and other properties.

3. **Scenario Execution**
   - Go to `/dk.sdu.bdd.xtext.examples/src/dk/sdu/bdd/xtext/examples/features`.
   - Open the 'main.py' file and execute it.

### Write a new Scenario and use the DSL features.

In order to use the features provided by Xtext, including syntax highlighting, code completion, error checking and navigation, we need to run a second Eclipse instance providing a new editor with the features mentioned.

1. **Generate Xtext Artifacts:**
   - Navigate to `/dk.sdu.bdd.text/src/dk/sdu/bdd/xtext/`, right-click on the "BddDsl.xtext" file and select `Run As -> MWE2 Workflow`.
     
2. **Run Eclipse Application:**
   - In the main Eclipse IDE, amoung the upper tabs, choose `Run ->  Run Configurations`.
   - In the Run Configurations dialog, look for "Eclipse Application" under "Java Application" or a similar category on the left.
   - If there isn't already a configuration, right-click on "Eclipse Application" and choose "New Configuration".
     In the right pane, you may need to set up the Main tab, specifying the project and other details. Then, click "Run" to launch the Eclipse Application.
   - The new runtime Eclipse instance launched is now equipped with the DSL editor.

3. **Create a New DSL File:**
   - After launching the Eclipse Application, go to the main Eclipse IDE window.
   - Now, go to the top menu again, but this time choose `File-> Import`
   - In the Import dialog, expand the General category. 
   - Select "Existing Projects into Workspace" and click "Next".
  
   In the "Import Projects into Workspace" dialog:
   - Select root directory and browse to the location of your project.
   - Make sure that the checkbox next to your project (in our case, "dk.sdu.bdd.xtext.examples") is checked.
   - Click Finish. Eclipse will now import the selected project into your workspace.
   - You can now modify the "sample.bdd" file as needed, and observe the interactive features of the editor as you write.

### Implementing New Grammar Rules

If you wish to modify the DSL and establish your own language and grammar rules, follow these steps:

1. **Implementing a New DSL:**
   - Navigate to `/dk.sdu.bdd.text/src/dk/sdu/bdd/xtext/` and make changes to the "BddDsl.xtext" file.
   - For assistance in implementing a new DSL, refer to this tutorial: [Xtext Domain Model Walkthrough](https://eclipse.dev/Xtext/documentation/102_domainmodelwalkthrough.html).

2. **Generate Xtext Artifacts:**
   - After defining your grammar rules, right-click on the "GenerateBddDsl.mwe2" file located under `/dk.sdu.bdd.text/src/dk/sdu/bdd/xtext/` and select `Run As -> MWE2 Workflow`.
     
3. **Run Eclipse Application:**
   - In the main Eclipse IDE, amoung the upper tabs, choose `Run ->  Run Configurations`.
   - In the Run Configurations dialog, look for "Eclipse Application" under "Java Application" or a similar category on the left.
   - If there isn't already a configuration, right-click on "Eclipse Application" and choose "New Configuration".
     In the right pane, you may need to set up the Main tab, specifying the project and other details. Then, click "Run" to launch the Eclipse Application.
   - The new runtime Eclipse instance launched is now equipped with the DSL editor.

5. **Create a New DSL File:**
   - After launching the Eclipse Application, go to the main Eclipse IDE window.
   - Now, go to the top menu again, but this time choose `File-> Import`
   - In the Import dialog, expand the General category. 
   - Select "Existing Projects into Workspace" and click "Next".
  
   In the "Import Projects into Workspace" dialog:
   - Select root directory and browse to the location of your project.
   - Make sure that the checkbox next to your project (in our case, "dk.sdu.bdd.xtext.examples") is checked.
   - Click Finish. Eclipse will now import the selected project into your workspace.

### Note:
- Ensure that all necessary dependencies and plugins are installed in Eclipse for proper DSL development.
- Refer to the project documentation for detailed information on DSL syntax rules and usage.
