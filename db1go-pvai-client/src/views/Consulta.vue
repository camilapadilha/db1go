<template>
    <v-data-table
    :headers="headers"
    :items="desserts"
    class="elevation-1"
  >
    <template v-slot:items="props">
      <td>{{ props.item.name }}</td>
      <td>{{ props.item.date }}</td>
      <td>{{ props.item.start }}</td>
      <td>{{ props.item.end}}</td>
    </template>
  </v-data-table>
</template>
<script lang="ts">
import { Vue, Component } from "vue-property-decorator";

@Component({})
export default class Consulta extends Vue {}
</script>
<style lang="sass" scoped>

</style>

<script>
  export default {
    data () {
      return {
        headers: [
          {
            text: 'Name',
            sortable: false,
            value: 'name'
          },
          { text: 'Date', value: 'data'},
          { text: 'Start Value', value: 'start'},
          { text: 'End Value', value: 'end'}

        ],
        desserts: [
          
          {
            name: 'Frozen Yogurt',
            date: "15-02-2019",
            start: 6.0,
            end: 24

          },
          {
            name: 'Ice cream sandwich',
            date: "20-02-2019",
            start: 9.0,
            end: 37
          },
          {
            name: 'Eclair',
            date: "26-01-2019",
            start: 16.0,
            end: 23
          }
        ]
      }
    }
  }
</script>

