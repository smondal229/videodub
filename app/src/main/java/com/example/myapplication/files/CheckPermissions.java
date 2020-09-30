package com.example.myapplication.files;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/**
 * CheckPermissions can be used to check different Permissions
 **/

public class CheckPermissions {
    
    public static final int PERMISSIONS_REQUEST_CAMERA = 300;

    
    public static boolean is_CAMERA_PermissionGranted(Context context) {

        if (Build.VERSION.SDK_INT >= 23) {
            return  (context.checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED);
        }
        else {
            // Permission is granted by default
            return true;
        }

    }
    
    
    public static boolean is_STORAGE_PermissionGranted(Context context) {
    
        if (Build.VERSION.SDK_INT >= 23) {
            return  (context.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED);
        }
        else {
            // Permission is granted by default
            return true;
        }
        
    }
    

    
    
    public static boolean is_PHONE_STATE_PermissionGranted(Context context) {
        
        if (Build.VERSION.SDK_INT >= 23) {
            return  (context.checkSelfPermission(Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED);
        }
        else {
            // Permission is granted by default
            return true;
        }
        
    }

    public static boolean is_EXTERNAl_STORAGE_PermissionGranted(Context context) {

        if (Build.VERSION.SDK_INT >= 23) {
            return  (context.checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED);
        }
        else {
            // Permission is granted by default
            return true;
        }

    }
    
}

