.class public abstract Lv0/q;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lv0/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lv0/f;->c:Lv0/f;

    sget-object v1, Lv0/g;->c:Lv0/g;

    new-instance v2, Lv0/p;

    invoke-direct {v2, v0, v1}, Lv0/p;-><init>(Lc9/e;Lc9/c;)V

    sput-object v2, Lv0/q;->a:Lv0/p;

    return-void
.end method
