function submitForm() {
    // Get form values
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;

    const genderElements = document.getElementsByName('gender');
    const gender = Array.from(genderElements)
        .filter(element => element.checked)
        .map(element => element.value)
        .join(', ');

    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;

    // Display popup with form values
    const popupContent = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${gender}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
    `;

    document.getElementById('popup-content').innerHTML = popupContent;

    // Display popup
    document.getElementById('popup').style.display = 'flex';
}

function resetForm() {
    // Reset form values
    document.getElementById('surveyForm').reset();
}

function closePopup() {
    // Hide popup and reset form
    document.getElementById('popup').style.display = 'none';
    resetForm();
}
