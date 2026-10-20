.class public final Lb/l;
.super Ld/d;


# instance fields
.field public final a:Lb/a;


# direct methods
.method public constructor <init>(Lb/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/l;->a:Lb/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lb/l;->a:Lb/a;

    invoke-virtual {v0, p1}, Lb/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final b()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Registration is automatically handled by rememberLauncherForActivityResult"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
