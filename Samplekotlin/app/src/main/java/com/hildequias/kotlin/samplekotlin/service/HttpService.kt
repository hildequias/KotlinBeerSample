package com.hildequias.kotlin.samplekotlin.service

import android.content.Context
import android.util.Log

import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.Volley
import com.android.volley.toolbox.JsonObjectRequest

import org.json.JSONObject

/**
 * Created by junior on 6/2/17.
 */

open class HttpService() {

    fun doGet(url: String, context:Context, completion: ((JSONObject) -> Void)) {

        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(context)

        // prepare the Request
        val getRequest = JsonObjectRequest(Request.Method.GET, url, null, Response.Listener<JSONObject> { response ->

            // display response
            Log.d("Response", response.toString())
            completion(response)

        }, Response.ErrorListener { error ->

            Log.d("Error.Response", error.message)
            completion(JSONObject())
        })

        // Add the request to the RequestQueue.
        queue.add(getRequest)
    }

    fun doPost(url: String, parameters:JSONObject, context: Context, completion: ((JSONObject) -> Void)) {

        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(context)

        // prepare the Request
        val getRequest = JsonObjectRequest(Request.Method.POST, url, parameters, Response.Listener<JSONObject> {response ->

            // display response
            Log.d("Response", response.toString())
            completion(response)

        }, Response.ErrorListener { error ->
            Log.d("Error.Response", error.message)
            completion(JSONObject())
        })

        // Add the request to the RequestQueue.
        queue.add(getRequest)
    }
}
