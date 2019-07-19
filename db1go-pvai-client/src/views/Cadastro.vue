<template>
  <div>

  <v-form ref="form">
        <v-flex xs12 md4 ml-5>
            <v-text-field
            label="Name"
            ></v-text-field>
        </v-flex>
        <v-flex xs12 md4 ml-5>
            <v-text-field
            label="Date"
            ></v-text-field>
        </v-flex>
        <v-flex xs12 md4 ml-5>
            <v-text-field
            label="Start Value"
            ></v-text-field>
        </v-flex>
        <v-flex xs12 md4 ml-5>
            <v-text-field
            label="End Value"
            ></v-text-field>
        </v-flex>
        
        <v-btn color="info">Salvar</v-btn>
        
  </v-form>
  </div>
</template>
<script lang="ts">
import {Vue, Component} from 'vue-property-decorator'

@Component({})
export default class Cadastro extends Vue {
    
}
</script>
<style lang="sass" scoped>

</style>



