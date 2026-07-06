# Simple Bus Reservation System

A lightweight, console-based Bus Reservation System implemented in Java. This application demonstrates fundamental Object-Oriented Programming (OOP) concepts by modeling a real-world ticket reservation workflow.

## 🚀 Features

- **Bus Information Display**: View available buses, including their bus numbers, AC/Non-AC status, and seating capacities.
- **Seat Availability Validation**: Real-time validation of seat capacity on a specific date before confirming a booking.
- **Interactive Console flow**: Step-by-step console prompts for entering passenger details, selecting a bus, and booking a date.

## 📂 Project Structure

```text
Simple-Bus-Reservation-Project-using-Java/
├── src/
│   ├── BusMain.java   # Application Entry Point & Booking Control Flow
│   ├── Bus.java       # Bus Class (Attributes & Info Display)
│   └── Booking.java   # Booking Class (Validation & Passenger Details)
└── README.md          # Project Documentation
```

## 🛠️ Getting Started

### Prerequisites

Make sure you have the Java Development Kit (JDK) installed (version 8 or higher is recommended).

### Running the Application

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/Simple-Bus-Reservation-Project-using-Java.git
   cd Simple-Bus-Reservation-Project-using-Java
   ```

2. **Compile the Code**:
   Navigate to the project root and compile the source files to a `bin` directory:
   ```bash
   javac src/*.java -d bin
   ```

3. **Run the Application**:
   Run the compiled bytecode using:
   ```bash
   java -cp bin BusMain
   ```

## 📝 Usage Flow

1. Upon execution, the program prints the list of available buses and their seating capacities.
2. Follow the prompt to make a booking:
   - Enter your name.
   - Select the bus number.
   - Input the travel date in the format `dd-mm-yyyy` (e.g., `12-10-2026`).
3. The system automatically validates seat availability and provides immediate feedback.
