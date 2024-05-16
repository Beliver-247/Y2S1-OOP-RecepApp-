// Function to display error message and hide it after 2 seconds
function displayErrorMessage() {
    var errorMessage = document.getElementById('errorMessage');
    errorMessage.style.display = 'block'; // Show the error message

    // Set timeout to hide the error message 
    setTimeout(function() {
        errorMessage.style.display = 'none'; // Hide the error message
    }, 2500);
}
