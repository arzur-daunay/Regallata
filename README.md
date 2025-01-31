[<img src="https://www.ensicaen.fr/wp-content/uploads/2017/02/LogoEnsicaen.gif" width="256" >](https://www.ensicaen.fr)

La Regalata
================

## Description du projet

Ce projet vise à la création d'un jeu de Régate en 2D programmé en utilisant Java et JavaFX.

Ce projet vise également à nous faire appliquer les principes de conception vus dans le cadre
du cours de Génie Logiciel en première et en deuxième année, ainsi que les principes d'intégration
continue et de développement agile.

Le projet est géré par le moteur de production 'gradle'.

## Organisation du projet
 
Le projet a la structure suivante :

    .
    │
    ├── build.gradle, settings.gradle, gradle.properties ...
    │
    ├── .gitlab-ci.yml
    │
    ├── gradle
    │
    ├── files
    │       ├── Architexture.txt
    │       ├── Rapport-Groupe-TP1.pdf
    │       ├── UML-Projet.png
    │       
    └── src
        ├── main
        │   ├── main.iml
        │   │ 
        │   ├── java
        │   │      ├── fr.ensicaen.genielogiciel.mvp
        │   │          ├──LoginMain.java        
        │   │          ├──model
        │   │          │    ├──Model.java   
        │   │          │    ├──boat    
        │   │          │    │    ├──Boat.java   
        │   │          │    │    ├──BoatDecorator.java   
        │   │          │    │    ├──Regalata.java   
        │   │          │    │    ├──Vector.java   
        │   │          │    │    │       
        │   │          │    │    ├──crew    
        │   │          │    │    │     ├──Crew.java    
        │   │          │    │    │     ├──FourMembersCrew.java 
        │   │          │    │    │     ├──TwoMembersCrew.java
        │   │          │    │    │            
        │   │          │    │    ├──sail  
        │   │          │    │         ├──LargeSail.java          
        │   │          │    │         ├──MeidumSail.java  
        │   │          │    │         ├──Sail.java  
        │   │          │    │        
        │   │          │    ├──course    
        │   │          │         ├──Buoy.java   
        │   │          │         ├──Course.java   
        │   │          │         ├──Path.java
        │   │          │         ├──Weather.java   
        │   │          │    
        │   │          ├──presenter
        │   │          │    ├──GamePresenter.java 
        │   │          │    ├──LoginPresenter.java 
        │   │          │    │  
        │   │          │    ├──command  
        │   │          │         ├──CmdLeft.java  
        │   │          │         ├──CmdRight.java  
        │   │          │         ├──Command.java 
        │   │          │         ├──CommandRegister.java 
        │   │          │         ├──FileReader.java 
        │   │          │         ├──FileWriter.java 
        │   │          │        
        │   │          ├──view
        │   │               ├──GameView.java 
        │   │               ├──LoginView.java 
        │   │ 
        │   ├── ressources
        │          ├── fr.ensicaen.genielogiciel.mvp
        │              ├──MessageBundle.properties   
        │              ├──MessageBundle_en_US.properties  
        │              │        
        │              ├──view   
        │                   ├──boat.png   
        │                   ├──LoginDialog.css         
        │                   ├──Logindialog.fxml         
        │                   ├──sand.jpg         
        │                   ├──SpotMap.css         
        │                   ├──SpotMap.fxml               
        ├── test
            ├── test.iml      
            │ 
            ├── java
                   ├── fr.ensicaen.genielogiciel.mvp
                       ├──model
                       │    ├──ModelTest.java    
                       │    ├──boat    
                       │    │    ├──RegalataTest.java
                       │    │        
                       │    ├──course    
                       │         ├──CourseTest.java
                       │         ├──WeatherTest.java
                       │    
                       ├──presenter
                       │    ├──LoginPresenterTest.java
                       │        
                       ├──view
                            ├──GameView.java 
                            ├──LoginView.java 
         

