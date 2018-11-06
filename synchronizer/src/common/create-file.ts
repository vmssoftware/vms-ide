import vscode from "vscode";

export async function createFile(fileUri: vscode.Uri, content: string) {
    try {
        let range: vscode.Range | undefined;
        try {
            const textDoc = await vscode.workspace.openTextDocument(fileUri);
            range = textDoc.validateRange(new vscode.Range(0, 0, 32767, 32767));
        } catch (err) {
            range = undefined;
        }
        const we = new vscode.WorkspaceEdit();
        if (!range) {
            we.createFile(fileUri);
            we.insert(fileUri, new vscode.Position(0, 0), content);
        } else {
            we.replace(fileUri, range, content);
        }
        const status = await vscode.workspace.applyEdit(we);
        if (status) {
            const textDoc = await vscode.workspace.openTextDocument(fileUri);
            const saved = await textDoc.save();
            return saved;
        } else {
            return false;
        }
    } catch (err) {
        return false;
    }
}
