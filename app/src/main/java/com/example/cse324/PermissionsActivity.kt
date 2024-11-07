package com.example.cse324

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import android.Manifest
import android.content.pm.PackageManager
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.PackageManagerCompat

class PermissionsActivity : AppCompatActivity() {
    private val permission = arrayOf(
        android.Manifest.permission.CAMERA,
        android.Manifest.permission.ACCESS_FINE_LOCATION
    )
    private val PERMISSION_REQUEST_CODE = 123
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permissions)
//        if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
//            != PackageManager.PERMISSION_GRANTED){
//            requestLocationPermission()  //  function to request location
//        }

        // to grant permission to accessing camera
        if(!hasPermission(permission)){
            ActivityCompat.requestPermissions(this,permission, PERMISSION_REQUEST_CODE)
        }else{
            Toast.makeText(this, "Pemission already granted", Toast.LENGTH_SHORT).show()
        }
    }

    private fun hasPermission(permission: Array<String>): Boolean {
        return permission.all { permission ->
            ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        
        if(requestCode == PERMISSION_REQUEST_CODE){
            val deniedPermission = mutableListOf<String>()
            for(i in permissions.indices){
                if(grantResults[i] != PackageManager.PERMISSION_GRANTED){
                    deniedPermission.add(permissions[i])
                }
            }
            if(deniedPermission.isEmpty()){
                Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "permission denied : $deniedPermission", Toast.LENGTH_SHORT).show()
            }
        }
    }

//    private fun requestLocationPermission() {
//        val requestPermissionLauncher = registerForActivityResult(
//            ActivityResultContracts.RequestPermission()
//        ){
//            isGranted : Boolean ->
//            if(isGranted){
//                accessLocation() // a function
//            }else{
//                Toast.makeText(this, "Location Permission is required", Toast.LENGTH_SHORT).show()
//            }
//        }
//        requestPermissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
//    }
//
//    private fun accessLocation() {
//        Toast.makeText(this, "Accessing Loaction", Toast.LENGTH_SHORT).show()
//    }
//



}