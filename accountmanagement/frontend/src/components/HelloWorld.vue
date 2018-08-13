<template>
  <div class="well">
  	<form>
    <div class="form-group">
      <label for="fname">First Name:</label>
      <input type="text" class="form-control" id="fname" placeholder="Enter First Name">
    </div>
    <div class="form-group">
      <label for="sname">Surname:</label>
      <input type="text" class="form-control" id="sname" placeholder="Enter Surname">
    </div>
    <div class="form-group">
      <label for="accno">Account Number:</label>
      <input type="text" class="form-control" id="accno" placeholder="Enter Account Number">
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
    </form>
</div>
</template>

<script>
/* eslint-disable */
export default {
  name: 'Dashboard',
  data () {
    return {
      msg: 'Welcome',
      Account: {firstName:'', lastName:'', accountNo:'' },
    }
  },
  methods: {
  	set(){
  		let newAcc = {
	  		firstName: this.Account.firstName,
			lastName: this.Account.lastName,
			accountNo: this.Account.accountNo,
  		};
  		console.log(newAcc);
  		}
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
