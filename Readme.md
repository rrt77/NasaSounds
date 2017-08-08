**SOUNDS API**
----
  Returns json data about a single user.

* **URL**

  https://api.nasa.gov/planetary/sounds

* **Method:**

  `GET`
  
*  **URL Params**

   **Required:**
 
   `api_key=[String]`

* **Data Params**

  q=[String]
  limit=[Integer]

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ id : 1, name : "xyz" }`
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "doesn't exist" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`

* **Sample Call:**

  ```javascript
    $.ajax({
      url: "/users/1",
      dataType: "json",
      type : "GET",
      success : function(r) {
        console.log(r);
      }
    });
  ```
