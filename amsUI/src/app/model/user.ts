export class User {
    constructor(
        public customerId:string,
        public password:string,
        public pancard:string,
        public isValid:boolean,
        public name:string,
    ){}
}
