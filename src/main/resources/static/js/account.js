function btnEdit(key){
    $(document).ready(function() {
        $.ajax({
            url: "/account/showAccount",
            type: "GET",
            data: {
                id: key
            },
            success: function(response) {
                $('#edit_id').val(response.id);
                $('#edit_username').val(response.username);
                $("#edit_password").val(response.password);
                $("#edit_name").val(response.name);
                $("#edit_email").val(response.email);
                $("#edit_phone").val(response.phone);
                $("#edit_role").val(response.user_role);
                console.log(response);
            }
        });
    });
    clickEditToggle();
}
function deleteAccount(key){
    $(document).ready(function() {
        $.ajax({
            url: "/account/deleteAccount",
            type: "POST",
            data: {id: key},
            success: function (response) {
                location.reload();
                alert("Object deleted successfully");
            }
        });
    });
}
function saveAccount(){
    $(document).ready(function() {
        var data = $("#saveForm").serialize();
        $.ajax({
            url: "/account/saveAccount",
            type: "Post",
            data: data,
            success: function (response) {
                console.log("get save infomation")
                alert('Product updated successfully');
            }
        });
    });
}
function updateAccount(){
    $(document).ready(function() {
        var data = $("#updateForm").serialize();
        console.log(data);
        $.ajax({
            url: "/account/updateAccount",
            type: "Post",
            data: data,
            success: function (response) {
                location.reload();
                alert('Product updated successfully');
            }
        });
    });
}
function search(){
    $(document).ready(function() {
        console.log("keyup")
        var key = $("#searchTerm").val();
        $.ajax({
            url: '/account/search',
            type: 'POST',
            data: {
                keyword: $("#searchTerm").val()
            },
            success: function(response) {
                $("#searchTerm").text(key);
                console.log(response);
            }
        });
    });
}