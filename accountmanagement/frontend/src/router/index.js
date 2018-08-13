import Vue from 'vue'
import Router from 'vue-router'
import AddAccounts from '@/components/AddAccounts'
import GetAccount from '../components/GetAccount'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/add-accounts',
      name: 'AddAccount',
      component: AddAccounts
    },
    {
      path: '/get-accounts',
      name: 'GetAccount',
      component: GetAccount
    },
  ]
})
