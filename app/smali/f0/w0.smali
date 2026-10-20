.class public abstract Lf0/w0;
.super Ljava/lang/Object;


# static fields
.field public static final a:La4/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, La4/c0;

    new-instance v1, La4/c0;

    invoke-static {}, Lt9/ۧۦۥ۟;->ۣۦۧۢ()Lf0/v0;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, La4/c0;-><init>(Ljava/lang/Object;I)V

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La4/c0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lf0/w0;->a:La4/c0;

    return-void
.end method
