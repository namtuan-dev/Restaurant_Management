start();

function start() {
    getWaitlists(renderWaitlists);
}
function getWaitlists(callback) {
    var customerAPI = "http://localhost:8088/hcr/employee/allWaitlist";
    fetch(customerAPI)
        .then(function (response) {
            return response.json();
        })
        .then(callback);

}
function renderWaitlists(waitlists) {
    console.log(waitlists);
    var waitlist = document.querySelector("#tbody");
    var htmls = waitlists.map(function (waitlist, index) {
        console.log(waitlist);
        return `
          <div class="container" style="background-color: #AEFAFF; border-radius: 20px; border: 1px solid #0695a0; margin-bottom: 10px;">
              <div class="row ">
                <h3 class="col-md-2 d-flex align-items-center justify-content-center">8:00</h3>
                <ul class="col-md-4">
                  <li>Name: </li>
                  <li>Phone: </li>
                  <li>Date: </li>
                </ul>
                <ul class=" col-md-3">
                  <li>People: 6</li>
                  <li>Table: 12</li>
                </ul>
                <ul class=" col-md-3">
                  <li>
                    <div class="btn btn-danger">Cancel</div>
                  </li>
                  <li>
                    <div class="btn btn-dark">Detail</div>
                  </li>
                </ul>
              </div>
            </div>
          </div>
    `;
    });
    waitlist.innerHTML += htmls.join("");
}