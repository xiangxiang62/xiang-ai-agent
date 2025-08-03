<script setup lang="ts">
import BasicLayout from '@/layouts/BasicLayout.vue'
import { useLoginUserStore } from '@/stores/loginUser.ts'
import { healthCheck } from '@/api/headCheckController.ts'

healthCheck().then((res) => {
  console.log(res)
})


const loginUserStore = useLoginUserStore()
loginUserStore.fetchLoginUser()

</script>

<template>
  <BasicLayout />
</template>

<style></style>
