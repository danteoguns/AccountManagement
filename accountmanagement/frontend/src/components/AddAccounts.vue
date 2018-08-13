<template>
  <div class="well">
    
	<v-menu open-on-hover top offset-y>
      <v-btn
        slot="activator"
        color="primary"
        dark
      >
        Account
      </v-btn>

      <v-list>
        <v-list-tile
          v-for="(item, index) in items"
          :key="index"
          @click=""
        >

        <router-link
        to="/add-accounts"
        tag="v-btn"
      	>
      	<v-list-tile-title>Add Accounts</v-list-tile-title>
      	</router-link>
      	
      	<router-link
        to="/get-accounts"
        tag="v-btn"
      	>
      	<v-list-tile-title>Get Accounts</v-list-tile-title>
      	</router-link>

        </v-list-tile>
      </v-list>
    </v-menu>
    
      <v-app id="inspire">
    <v-form v-model="valid">
      <v-text-field
        v-model="firstname"
        :rules="firstNameRules"
        :counter="10"
        label="First Name"
        required
      ></v-text-field>
      <v-text-field
        v-model="surname"
        :rules="surnameRules"
        :counter="10"
        label="Surname"
        required
      ></v-text-field>
      <v-text-field
        v-model="accountnumber"
        :rules="accNoRules"
        label="Account Number"
        required
      ></v-text-field>
            <v-btn
        :disabled="!valid"
        @click="submit"
      >
        submit
      </v-btn>
    </v-form>
  </v-app>
  
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
  data() {
    return {
      msg: 'Account Table',
      Account: {firstName: '', lastName: '', accountNo: ''},
      items: [
        {title: 'Add Account', path: '../components/AddAccounts'},
        {title: 'Get Account', path: '../components/GetAccount'}
      ],
      valid: false,
      firstname: '',
      firstNameRules: [
        v => !!v || 'First Name is required',
        v => v.length <= 10 || 'Name must be less than 10 characters'
      ],
      surname: '',
      surnameRules: [
        v => !!v || 'Surname is required',
        v => v.length <= 10 || 'Name must be less than 10 characters'
      ],
      accountnumber: '',
      accNoRules: [
        v => !!v || 'Account Number is required',
        v => /.+@.+/.test(v) || 'Account Number must be valid'
      ]
    }
  },
  methods: {
    set() {
      let newAcc = {
        firstName: this.Account.firstName,
        lastName: this.Account.lastName,
        accountNo: this.Account.accountNo,
      };
      console.log(newAcc);
    },

    submit() {
      if (this.$refs.form.validate()) {
        // Native form submission is not yet supported
        axios.post('/api/submit', {
          name: this.name,
          email: this.email,
          select: this.select,
          checkbox: this.checkbox
        })
      }
    }
  },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
