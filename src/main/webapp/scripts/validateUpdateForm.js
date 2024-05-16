// Function to validate the form before submission
function validateUpdateForm() {
    var fullName = document.getElementById('fullname').value.trim();
    var mobilePhone = document.getElementById('Mphone').value.trim();
    var homePhone = document.getElementById('Hphone').value.trim();
    var bloodType = document.getElementById('bloodtype').value.trim();
    var password = document.getElementById('pwd').value.trim();

    // Validate Full Name (must have at least two words)
    if (fullName.split(' ').length < 2) {
        alert('Please enter both first name and last name.');
        return false;
    }

    // Validate Mobile Phone (must have 10 characters and contain only numbers)
    if (mobilePhone.length !== 10 || isNaN(mobilePhone)) {
        alert('Mobile phone number must be 10 digits.');
        return false;
    }

    // Validate Home Phone (must have 10 characters and contain only numbers)
    if (homePhone.length !== 10 || isNaN(homePhone)) {
        alert('Home phone number must be 10 digits.');
        return false;
    }

    // Validate Blood Type (should contain one or two characters)
    if (bloodType.length < 1 || bloodType.length > 2) {
        alert('Blood type should be one or two characters.');
        return false;
    }


    // Validate Password complexity (at least one capital letter, one number, one special character)
    var hasCapitalLetter = false;
    var hasNumber = false;
    var hasSpecialChar = false;

    for (var i = 0; i < password.length; i++) {
        if (password[i] >= 'A' && password[i] <= 'Z') {
            hasCapitalLetter = true;
        }
        if (!isNaN(password[i])) {
            hasNumber = true;
        }
        // Check for special characters 
        if (!password[i].match(/^[0-9a-zA-Z]+$/)) {
            hasSpecialChar = true;
        }
    }

    if (!hasCapitalLetter || !hasNumber || !hasSpecialChar) {
        alert('Password must contain at least one capital letter, one number, and one special character.');
        return false;
    }
    
	if (password.length < 8) {
		alert('Password must have at least 8 characters.');
		return false;
	}

    return true; // Form is valid and can be submitted
}
