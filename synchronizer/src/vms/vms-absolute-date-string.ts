
export function VmsAbsoluteDateString(date: Date, locale: string = "en-US"): string {
    const f = new Intl.DateTimeFormat(locale, {month: "short"});
    const day = date.getUTCDate().toString(10).padStart(2, "0");
    const month = f.format(date);
    const year = date.getUTCFullYear().toString(10);
    const hour = date.getUTCHours().toString(10).padStart(2, "0");
    const minute = date.getUTCMinutes().toString(10).padStart(2, "0");
    const sec = date.getUTCSeconds().toString(10).padStart(2, "0");
    const dateString = `${day}-${month}-${year} ${hour}:${minute}:${sec}`;
    return dateString;
}
