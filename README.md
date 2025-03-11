# *Event Management App*

🎥 *Demo Video*  
For a comprehensive walkthrough of the Event Management App's features, watch the full demo video hosted on Google Drive:  
[View Full Demo Video](https://youtu.be/KW1-WJJZR6Y?si=5UE3LEeewf-6n2QO)

*Screenshots:*

- *Dashboard Overview:* A snapshot of the main dashboard displaying summary cards and key metrics.
- *Event Details:* A screenshot of the event details page showcasing event information, QR code scanning, and registration options.
- *Profile Management:* A view of the profile screen where users can update or remove their profile information.
- *Organizer Panel:* A look at the organizer’s interface for creating and managing events.
    


## *Overview*
The *Event Management App* is an Android application that provides fair and accessible event registration through a *lottery-based system*. The app ensures equal opportunities for participants by allowing them to join waiting lists and be randomly selected for events.

The application supports *multi-user roles* (Entrant, Organizer, Admin) with distinct functionalities, *QR code scanning*, and *real-time event management* using *Firebase*.

---

## *Features*
### *Entrant Features*
-  *Join or leave an event waiting list*
-  *Receive notifications* if selected or not
-  *Get another chance* if a selected entrant declines
-  *Upload, update, or remove profile pictures*
-  Optional: *Geolocation-based sign-ups*
-  *View event details* using QR code scanning
-  *Auto-login* via device authentication (no username/password needed)

###  *Organizer Features*
-  *Create and manage events*
-  *Generate unique QR codes* for event registration
-  *View and manage waiting lists*
-  *Track entrants' registration locations on a map*
-  *Run a fair lottery system* to select event participants
-  *Upload, update, and manage event posters*
-  *Send targeted notifications* to entrants and participants

###  *Admin Features*
-  *Remove events, profiles, and QR code data*
-  *Browse events, profiles, and uploaded images*
-  *Remove facilities that violate policies*

---

## *Technology Stack*
- *Programming Language*: Java (Core)
- *Development Tools*: Android Studio, Firebase
- *Database & Cloud Storage*: Firebase Firestore, Firebase Storage
- *UI Testing*: Espresso, JUnit
- *Dependency Management*: Gradle

---

## *Installation & Setup*
### *Prerequisites*
1. Install [Android Studio](https://developer.android.com/studio)
2. Set up [Firebase](https://firebase.google.com/)
3. Clone the repository:
   
   git clone https://github.com/yourusername/event-lottery-app.git
   cd event-lottery-app
   
4. *Open the project in Android Studio*
5. *Connect Firebase:*
   - Go to *Tools > Firebase* and follow the integration guide
   - Add your google-services.json file (from Firebase Console)
6. *Sync Gradle and build the project*
7. *Run the app on an emulator or a real device*

---

## *Usage Guide*

### 🏁 *Starting the App*

#### *Sign Up / Log In:*
- Users can register as *Entrants*, *Organizers*, or *Admins*
- Firebase Authentication handles secure logins

#### *Entrants:*
- Browse events
- Scan a QR code to get event details
- Join or leave an event’s waiting list
- Receive lottery selection notifications

#### *Organizers:*
- Create events and generate QR codes
- Manage a waiting list of interested participants
- Notify winners when the lottery draw is completed
- Upload event posters and details

#### *Admins:*
- Remove events, profiles, and images
- Monitor event and user activities
- Ensure fair use by removing policy-violating facilities

---

## *Testing*

### *Unit Tests*
- We use *JUnit* for backend logic testing (event selection, user management, and QR code processing).
- Run unit tests with:
  
  ./gradlew test
  
### *UI Tests (Espresso)*
- We use *Espresso* to test user interactions such as:
  - Navigating between screens
  - Registering for an event
  - Scanning a QR code
  - Receiving notifications

- Run UI tests with:
  
  ./gradlew connectedAndroidTest

## Not functioning?
If you run into difficulties or errors in the code please feel free to reach out.
Email: contact@shahmeer.xyz
  
