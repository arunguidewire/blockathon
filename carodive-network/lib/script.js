/**
 * Create Employee Transaction
 * @param {carodive.CreateEmployee} employeeData
 * @transaction
 * 
 * 1. Create Paticipant
 */

function createEmployee(employeeData) {

    
    // Get the Asset Registry

    return getAssetRegistry('carodive.Employee')
    
        .then(function(employeeRegistry){
            // Now add the Employee - global function getFactory() called
            var  factory = getFactory();

            var  NS =  'carodive.carodive';

            //generate ID
            var  employeeID = getUid();

            //create new employee object with generated employee ID
            var  employee = factory.newResource(NS,'Employee',enmployeeID);

            //populate the values of employee
            employee.employeeCompanyID = employeeData.employeeCompanyID
            employee.employeeName = employeeData.employeeName
            employee.employeeCompany = employeeData.employeeCompany

            //Add to registry
            return employeeRegistry.add(employee);
        });
}

function getUid() {
    function s4() {
      return Math.floor((1 + Math.random()) * 0x10000)
        .toString(16)
        .substring(1);
    }
    return s4() + s4() + '-' + s4() + '-' + s4() + '-' + s4() + '-' + s4() + s4() + s4();
  }