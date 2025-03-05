# GUI Calculator (Geometric Calculator) Project

## Overview
The GUI Calculator is a Java-based application designed to compute the area and perimeter of geometric shapes, including circles, rectangles, and squares. This project leverages object-oriented programming principles and provides a dynamic user interface using Java Swing.

## Table of Contents
- [Features](#features)
- [Project Structure](#project-structure)
- [Installation and Setup](#installation-and-setup)
- [Usage](#usage)
- [Contributing](#contributing)
- [Contact](#contact)

## Features
- **Shape Calculations**: Supports area and perimeter calculations for:
  - Circle
  - Rectangle
  - Square

- **Dynamic User Interface**: 
  - Adjusts input fields based on the selected shape.
  - Provides checkboxes for selecting desired outputs (area and/or perimeter).

- **Robust Input Validation**: Ensures valid numeric entries and handles errors gracefully.

- **Modular Design**: Utilizes an abstract `GeometricObject` base class with specific implementations for each shape.

## Project Structure
- **build/**: Contains compiled classes and build artifacts.
- **nbproject/**: NetBeans project configuration files.
- **src/**: Source code for the application.
- **test/**: Test files (if applicable).
- **build.xml**: Ant build script for compiling and running the project.
- **manifest.mf**: Manifest file for JAR packaging.

## Installation and Setup

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- NetBeans IDE (or any IDE that supports Ant build scripts)

### Steps
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/elbehwash0/Java_Projects
   ```

2. **Open the Project**: Use NetBeans or your preferred IDE to open the project. The repository includes all necessary source code and configuration files.

3. **Build the Project**:
   - **NetBeans**: Use the "Clean and Build" option.
   - **Command Line**: Navigate to the project’s root directory and execute:
     ```bash
     ant clean build
     ```

4. **Run the Application**:
   - **NetBeans**: Execute the Main class.
   - **Command Line**: Use:
     ```bash
     ant run
     ```

## Usage
1. **Launch the Application**: A window titled “Geometric Calculator” will appear.
2. **Select a Shape**: Choose from Circle, Rectangle, or Square.
3. **Enter Dimensions**: Provide the necessary measurements.
4. **Select Outputs**: Use checkboxes to choose between area and perimeter.
5. **Calculate**: Click “Calculate and Display” to view results.
6. **Error Handling**: Invalid inputs will be cleared, and an error message will be displayed.

## Contributing
We welcome contributions! To contribute:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes and push the branch.
4. Open a pull request with a detailed description of your changes.

## Contact
For inquiries, issues, or suggestions, please contact Abdallah Mohamed at [abdullah.mohamed.9511@gmail.com](mailto:abdullah.mohamed.9511@gmail.com) or open an issue on the [GitHub repository](https://github.com/elbehwash0/Java_Projects).