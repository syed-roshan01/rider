.class public abstract Lja/a;
.super Ljava/lang/Object;


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lja/j;->d:Lja/j;

    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    iget-object v0, v0, Lja/j;->a:[B

    sput-object v0, Lja/a;->a:[B

    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    return-void
.end method
