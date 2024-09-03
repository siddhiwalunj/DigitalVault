package com.digitalvault;


import com.digitalvault.Dashboard.SaveInfo;
import com.digitalvault.controller.InitializeApp;
import com.digitalvault.controller.LoginController;
import com.digitalvault.image_blob.services.ImageUploader;
import com.digitalvault.image_blob.view.ImageDisplay;

import javafx.application.Application;
public class Main {
    public static void main(String[] args) {
      
        Application.launch(InitializeApp.class,args);

    }
}
  