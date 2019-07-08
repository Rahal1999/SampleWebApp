<h1>Hello JSP and Servlet!</h1>
</br>

<h1>Add Book</h1>
<form action="AddServlet" method="post">
    Book ID : <input type="text" name="id" size="20">
    </br>
    Book Title : <input type="text" name="title" size="20">
    </br>
    Price : <input type="text" name="price" size="20">
    <input type="submit" value="Add" />
</form>

</br></br>
<h1>Delete </h1>
<form action="DeleteServlet" method="post">
    Book ID : <input type="text" name="id" size="20">
    <input type="submit" value="Delete" />
</form>


</br></br>
<h1>Update</h1>
<form action="UpdateServlet" method="post">
    Book ID : <input type="text" name="id" size="20">
    </br>
    Book Title : <input type="text" name="title" size="20">
    </br>
    Price : <input type="text" name="price" size="20">
    <input type="submit" value="Update" />
</form>

</br></br>
<h1>Display</h1>
<form action="DisplayServlet" method="post">
     <input type="submit" value="Display"  />
</form>
